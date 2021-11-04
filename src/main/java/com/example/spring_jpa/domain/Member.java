package com.example.spring_jpa.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="MEMBER")
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;
    private String city;
    private String street;
    private String zipcode;

    //mappedBy속성을 사용해 이 domain이 주인이 아님을 알려주고 주인으로 member를 지정
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

}
