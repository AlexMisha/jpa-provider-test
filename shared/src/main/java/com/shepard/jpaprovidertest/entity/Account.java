package com.shepard.jpaprovidertest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@SuppressWarnings("WeakerAccess")
@Entity
@Table(name = "account")
public class Account {

    @Getter
    @Setter
    @Id
    @GeneratedValue
    private Long id;

    @Getter
    @Setter
    @Column(name = "name")
    private String name;
}
