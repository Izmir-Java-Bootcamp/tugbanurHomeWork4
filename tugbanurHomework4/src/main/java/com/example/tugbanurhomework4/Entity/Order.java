package com.example.tugbanurhomework4.Entity;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_order")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Order {
    @Id
    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

}