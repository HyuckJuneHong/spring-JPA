package com.example.spring_jpa.domain.sub;

import com.example.spring_jpa.domain.Item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")    //엔티티를 저장할 때 구분 컬럼에 입력할 값
public class Album extends Item {

    private String artist;
    private String etc;
}
