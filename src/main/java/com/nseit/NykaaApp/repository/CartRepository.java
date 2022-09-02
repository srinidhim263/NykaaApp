package com.nseit.NykaaApp.repository;

import com.nseit.NykaaApp.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
