package com.example.tugbanurhomework4.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Basket {
    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name="quantity")
    private Integer quantity;

}
