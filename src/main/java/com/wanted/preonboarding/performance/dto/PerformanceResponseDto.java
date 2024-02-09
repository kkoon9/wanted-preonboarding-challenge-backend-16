package com.wanted.preonboarding.performance.dto;

import com.wanted.preonboarding.performance.domain.Performance;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
public class PerformanceResponseDto {
    private String name;
    private Integer round;
    private LocalDate startDate;
    private LocalTime startTime;
    private Boolean canReserve;

    @Builder
    public PerformanceResponseDto(String name, Integer round, LocalDate startDate, LocalTime startTime, Boolean canReserve) {
        this.name = name;
        this.round = round;
        this.startDate = startDate;
        this.startTime = startTime;
        this.canReserve = canReserve;
    }

    public static PerformanceResponseDto of(Performance performance) {
        return PerformanceResponseDto.builder()
                .name(performance.getName())
                .round(performance.getRound())
                .startDate(performance.getStartDate())
                .startTime(performance.getStartTime())
                .canReserve(performance.getCanReserve())
                .build();
    }
}
