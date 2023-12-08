package com.odeal.testcontainers.repository;

import com.odeal.testcontainers.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
