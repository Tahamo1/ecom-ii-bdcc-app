package com.mohammaditaha.billingservice.repository;
import com.mohammaditaha.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}