package com.coza_store.product_service.product_service.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "stock")

public class StockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quatity;
    @ManyToOne()
    @JoinColumn(name = "product_is")
    private ProductEntity productEntity;
    @ManyToOne()
    @JoinColumn(name = "size_id")
    private SizeEntity sizeEntity;
    @ManyToOne()
    @JoinColumn(name = "color_id")
    private ColorEntity colorEntity;




}
