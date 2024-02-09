package com.wanted.preonboarding.performance.dto;

import com.wanted.preonboarding.performance.domain.PerformanceSeat;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PerformanceSeatResponseDto {
    private Long id;
    private String name;
    private Integer round;
    private Integer price;
    private Integer gate;
    private char line;
    private Integer seat;
    private Boolean canReserve;

    @Builder
    public PerformanceSeatResponseDto(Long id, String name, Integer round, Integer price, Integer gate, char line, Integer seat, Boolean canReserve) {
        this.id = id;
        this.name = name;
        this.round = round;
        this.price = price;
        this.gate = gate;
        this.line = line;
        this.seat = seat;
        this.canReserve = canReserve;
    }

    public static PerformanceSeatResponseDto of(PerformanceSeat performanceSeat, String name) {
        return PerformanceSeatResponseDto.builder()
                .id(performanceSeat.getId())
                .name(name)
                .round(performanceSeat.getRound())
                .price(performanceSeat.getPrice())
                .gate(performanceSeat.getGate())
                .line(performanceSeat.getLine())
                .seat(performanceSeat.getSeat())
                .canReserve(performanceSeat.getCanReserve())
                .build();
    }
}
