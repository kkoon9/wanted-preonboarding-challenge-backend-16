package com.wanted.preonboarding.performance.repository;

import com.wanted.preonboarding.performance.domain.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, Long> {
    List<Performance> findByCanReserve(Boolean canReserve);
}
