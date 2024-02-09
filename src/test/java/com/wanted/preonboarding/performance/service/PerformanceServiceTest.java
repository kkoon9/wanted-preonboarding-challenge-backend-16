package com.wanted.preonboarding.performance.service;

import com.wanted.preonboarding.global.exception.BadRequestException;
import com.wanted.preonboarding.performance.repository.PerformanceRepository;
import com.wanted.preonboarding.performance.repository.PerformanceSeatRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class PerformanceServiceTest {
    @Mock
    private PerformanceRepository performanceRepository;

    @Mock
    private PerformanceSeatRepository performanceSeatRepository;

    @InjectMocks
    private PerformanceService performanceService;

    @BeforeEach
    void init() {
        performanceService = new PerformanceService(performanceRepository, performanceSeatRepository);
    }

    @Test
    @DisplayName("유효하지 않은 performanceId에 대해서는 BadRequestException 예외를 던진다.")
    void get_performance_test1() {
        // given
        Long performanceId에 = 1L;
        Boolean canReserve = true;
        given(performanceRepository.findById(any())).willReturn(Optional.empty());

        // when, then
        assertThatThrownBy(() -> performanceService.getPerformance(performanceId에, canReserve))
                .isInstanceOf(BadRequestException.class)
                .hasMessageContaining("ID에 해당하는 공연 정보가 없습니다.");
    }
}