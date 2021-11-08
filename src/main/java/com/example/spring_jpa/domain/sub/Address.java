package com.example.spring_jpa.domain.sub;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@EqualsAndHashCode
@Setter
public class Address {

    private String city;
    private String street;
    private String zipcode;


}
