package com.coza_store.product_service.product_service.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "product_name")
    private String productName;
    private double price;
    private String description;
    @Column(name = "sold_out_quantity")
    private int soldOutQuantity;
    @OneToMany(mappedBy = "productEntity")
    private Set<ImageEntity> imageEntities;
    @OneToMany(mappedBy = "productEntity")
    private Set<StockEntity>stockEntities;
    @ManyToOne()
    @JoinColumn(name = "category_id")
    private CategoryEntity categoryEntity;

}
