package com.wanted.preonboarding.performance.repository;

import com.wanted.preonboarding.performance.domain.PerformanceSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerformanceSeatRepository extends JpaRepository<PerformanceSeat, Long> {
    List<PerformanceSeat> findByIdAndCanReserve(final Long id, final Boolean canReserve);
}
