package com.ujjwal.WebApp.repository;

import com.ujjwal.WebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository< Product , Integer> {

}
