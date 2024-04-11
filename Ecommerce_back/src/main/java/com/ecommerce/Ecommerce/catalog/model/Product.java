package com.ecommerce.Ecommerce.catalog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "subcategory_id")
    private Subcategory subcategory;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @Column(nullable = false)
    private String name;

    @Column
    private Integer deliveryTime;

    @Column
    private String description;

    @Column
    private String details;

    @Column
    private String feedback;

    @Column
    private String gallery;

    @Column
    private String image;

    @Column
    private String offer;

    @Column
    private BigDecimal price;

    @Column
    private String reviews;

    @Column
    private Integer shipping;

    @Column
    private String tags;

    @Column
    private String video;

    @Column
    private String pet;

    @Column
    private Boolean active;

}