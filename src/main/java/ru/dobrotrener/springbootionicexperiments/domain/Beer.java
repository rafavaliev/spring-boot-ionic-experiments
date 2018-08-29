package ru.dobrotrener.springbootionicexperiments.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Beer {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Beer(String name) {
        this.name = name;
    }

    public Beer() {
    }
}