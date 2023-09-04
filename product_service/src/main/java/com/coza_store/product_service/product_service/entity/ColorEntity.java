package com.coza_store.product_service.product_service.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "color")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ColorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "color_name")
    private String colorName;
    @OneToMany(mappedBy = "colorEntity")
    private Set<ImageEntity> imageEntities;
    @OneToMany(mappedBy = "colorEntity")
    private Set<StockEntity> stockEntities;

}
