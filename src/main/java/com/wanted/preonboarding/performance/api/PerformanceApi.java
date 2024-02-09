package com.wanted.preonboarding.performance.api;

import com.wanted.preonboarding.performance.dto.PerformanceResponseDto;
import com.wanted.preonboarding.performance.service.PerformanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/performance")
public class PerformanceApi {
    private final PerformanceService performanceService;

    @GetMapping
    public List<PerformanceResponseDto> getPerformances(
            @RequestParam final Boolean canReserve
    ) {
        return performanceService.getPerformances(canReserve);
    }
}
