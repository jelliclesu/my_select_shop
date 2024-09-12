package com.spring.my_select_shop.repository;

import com.spring.my_select_shop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
