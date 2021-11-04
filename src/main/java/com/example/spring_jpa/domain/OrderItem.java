package com.example.spring_jpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_ITEM")
@Getter
@Setter
public class OrderItem {

    @Id @GeneratedValue
    @Column(name="ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @Column(name="ITEM_ID")
    private Item itemId;

    @ManyToOne
    @Column(name="ORDER_ID")
    private Order order;

    private int orderPrcie;
    private int count;
}