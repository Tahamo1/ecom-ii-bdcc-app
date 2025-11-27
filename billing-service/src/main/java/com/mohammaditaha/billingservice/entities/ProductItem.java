package com.mohammaditaha.billingservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mohammaditaha.billingservice.model.Product;
import jakarta.persistence.*;
import lombok.*;

@Entity @NoArgsConstructor
@AllArgsConstructor
@Builder @Getter
@Setter
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productId;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Bill bill;
    private int quantity;
    private double unitPrice;
    @Transient private Product product;
}
