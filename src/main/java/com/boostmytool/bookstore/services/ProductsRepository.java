package com.boostmytool.bookstore.services;

import com.boostmytool.bookstore.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Integer> {
}
