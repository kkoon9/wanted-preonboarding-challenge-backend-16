package com.wanted.preonboarding.performance;

import com.wanted.preonboarding.global.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity(name = "performances")
@NoArgsConstructor
public class Performance extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "round")
    private Integer round;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private PerformanceType performanceType;

    @Column(name = "can_reserve")
    private Boolean canReserve;

    @Builder
    public Performance(Long id, String name, Integer round, PerformanceType performanceType, Boolean canReserve) {
        this.id = id;
        this.name = name;
        this.round = round;
        this.performanceType = performanceType;
        this.canReserve = canReserve;
    }
}
