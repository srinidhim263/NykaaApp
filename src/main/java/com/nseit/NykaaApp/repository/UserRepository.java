package com.nseit.NykaaApp.repository;

import com.nseit.NykaaApp.model.ProductUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<ProductUser, Integer> {
    ProductUser findByEmail(String email);
}
