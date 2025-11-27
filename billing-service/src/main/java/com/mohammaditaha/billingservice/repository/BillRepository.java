package com.mohammaditaha.billingservice.repository;

import com.mohammaditaha.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
