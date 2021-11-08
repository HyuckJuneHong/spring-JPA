package com.example.spring_jpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "ITEM")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)   //부모 클래스에 상속 매핑 정의 -> 단일 테이블 전략
@DiscriminatorColumn(name="DTYPE")  //부모 클래스에 구분 컬럼을 지정 -> 구분 컬럼으로 "DTYPE"이란 이름을 기본으로 사용
public class Item {

    @Id @GeneratedValue
    @Column(name="ITEM_ID")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;  //재고 수량

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();
}
