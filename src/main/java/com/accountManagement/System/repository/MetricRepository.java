package com.accountManagement.System.repository;

import com.accountManagement.System.Entity.Metric;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetricRepository extends JpaRepository<Metric, Long> {
}
