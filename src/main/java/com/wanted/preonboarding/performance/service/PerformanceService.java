package com.wanted.preonboarding.performance.service;

import com.wanted.preonboarding.performance.domain.Performance;
import com.wanted.preonboarding.performance.dto.PerformanceResponseDto;
import com.wanted.preonboarding.performance.repository.PerformanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PerformanceService {
    private final PerformanceRepository performanceRepository;
    public List<PerformanceResponseDto> getPerformances(final Boolean canReserve) {
        List<Performance> performances = performanceRepository.findByCanReserve(canReserve);
        return performances.stream()
                .map(PerformanceResponseDto::of)
                .collect(Collectors.toList());
    }

}
