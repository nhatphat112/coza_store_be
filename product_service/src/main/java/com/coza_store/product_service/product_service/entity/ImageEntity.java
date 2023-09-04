package com.coza_store.product_service.product_service.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@Entity(name = "image")
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "image_name")
    private String imageName;
    @ManyToOne()
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;
    @ManyToOne()
    @JoinColumn(name = "color_id")
    private ColorEntity colorEntity;


}
