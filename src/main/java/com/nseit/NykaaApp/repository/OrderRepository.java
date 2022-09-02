package com.nseit.NykaaApp.repository;

import com.nseit.NykaaApp.model.OrderProducts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderProducts, Integer> {
}
