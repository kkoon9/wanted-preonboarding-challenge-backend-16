package com.wanted.preonboarding.performance.domain;

import com.wanted.preonboarding.global.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity(name = "performance_seat_infos")
@NoArgsConstructor
public class PerformanceSeat extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "performance_id")
    private Long performanceId;

    @Column(name = "round")
    private Integer round;

    @Column(name = "price")
    private Integer price;

    @Column(name = "gate")
    private Integer gate;

    @Column(name = "line")
    private char line;

    @Column(name = "seat")
    private Integer seat;

    @Column(name = "can_reserve")
    private Boolean canReserve;
}
