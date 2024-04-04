package com.ecommerce.Ecommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_product;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_category;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_subcategory;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStore;

    @Column(nullable = false)
    private String name;

    @Column
    private Integer delivery_time;

    @Column
    private String description;

    @Column
    private String details;

    @Column
    private String feedback;

    @Column
    private String galery;

    @Column
    private String image;

    @Column
    private String offer;

    @Column
    private String price;

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
    private Boolean isActive;


    @ManyToOne
    private Category category;

    @ManyToOne
    private Subcategory subcategory;

    @ManyToOne
    private Store store;



}
