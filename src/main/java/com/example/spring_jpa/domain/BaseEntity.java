package com.example.spring_jpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass   //부모 클래스가 테이블과 매핑하지 않고 상속 받는 자식 클래스에게 매핑 정보만 제공.
@Getter
@Setter
//MappedSuperclass로 지정한 클래스는 엔티티가 아니므로 entityManger.find() 혹은 JPQL에서 사용할 수 없다.
//즉, 단순히 매핑 정보를 상속할 목적으로만 사용한다.
public class BaseEntity {

    private Date createdDated;      //등록일
    private Date lastModifiedDate;  //수정일
}

