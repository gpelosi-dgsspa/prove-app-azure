package com.microsoft.azure.repository;

import com.microsoft.azure.entity.CustomTrackerEntrataMerci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface CustomTrackerEntrataMerciRepository extends JpaRepository<CustomTrackerEntrataMerci, BigDecimal> {
}
