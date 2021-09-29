package com.example.s3.product.entity;

import com.example.s3.common.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Product extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column
    private String name;

    @Column
    private Integer price;
    
    @Column
    private String imagePath;

    @Builder
    public Product(String name, Integer price, String imagePath) {
        this.name = name;
        this.price = price;
        this.imagePath = imagePath;
    }

}
