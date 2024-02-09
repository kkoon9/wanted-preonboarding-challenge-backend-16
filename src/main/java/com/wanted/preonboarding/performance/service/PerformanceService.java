package com.wanted.preonboarding.performance.service;

import com.wanted.preonboarding.global.exception.BadRequestException;
import com.wanted.preonboarding.performance.domain.Performance;
import com.wanted.preonboarding.performance.domain.PerformanceSeat;
import com.wanted.preonboarding.performance.dto.PerformanceResponseDto;
import com.wanted.preonboarding.performance.dto.PerformanceSeatResponseDto;
import com.wanted.preonboarding.performance.repository.PerformanceRepository;
import com.wanted.preonboarding.performance.repository.PerformanceSeatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PerformanceService {
    private final PerformanceRepository performanceRepository;
    private final PerformanceSeatRepository performanceSeatRepository;

    public List<PerformanceResponseDto> getPerformances(final Boolean canReserve) {
        List<Performance> performances = performanceRepository.findByCanReserve(canReserve);
        return performances.stream()
                .map(PerformanceResponseDto::of)
                .collect(Collectors.toList());
    }

    public List<PerformanceSeatResponseDto> getPerformance(final Long performanceId, final Boolean canReserve) {
        Performance performance = performanceRepository.findById(performanceId).orElseThrow(
                () -> new BadRequestException("ID에 해당하는 공연 정보가 없습니다.")
        );
        List<PerformanceSeat> performanceSeats = performanceSeatRepository.findByIdAndCanReserve(performanceId, canReserve);
        return performanceSeats.stream()
                .map(performanceSeat ->
                        PerformanceSeatResponseDto.of(performanceSeat, performance.getName())
                )
                .collect(Collectors.toList());
    }
}
