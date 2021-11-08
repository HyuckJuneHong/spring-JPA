package com.example.spring_jpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "CATEGORY")
public class Category {

    @Id @GeneratedValue
    @Column(name ="CATEGORY_ID")
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name="CATEGORY_ITEM",                        //JoinTable.name: 연결 테이블 지정
        joinColumns = @JoinColumn(name = "CATEGORY_ID"),    //joinColumns: 현재 방향인 엔티티와 매핑할 조인 컬럼 정보 지정
        inverseJoinColumns = @JoinColumn(name="ITEM_ID"))   //inverseJoinColumns: 반대 방향인 엔티티와 조인 컬럼 정보 지정
    private List<Item> items = new ArrayList<>();

    //카테고리 계층 구조를 위한 필드들
    @ManyToOne
    @JoinColumn(name="PARENT_ID")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();

    //연관 관계 메소드
    public void addChildCategory(Category child){
        this.child.add(child);
        child.setParent(this);
    }

    public void addItem(Item item){
        items.add(item);
    }
}
