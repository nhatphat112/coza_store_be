package com.coza_store.product_service.product_service.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "size")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "size_name")
    private String sizeName;
    @OneToMany(mappedBy = "sizeEntity")
    private Set<StockEntity> stockEntities;



}
