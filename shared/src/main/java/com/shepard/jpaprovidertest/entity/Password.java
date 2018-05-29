package com.shepard.jpaprovidertest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "password")
@Cacheable(false)
public class Password {

    public Password() {
    }

    public Password(Long id, String hash, Account account) {
        this.id = id;
        this.hash = hash;
        this.account = account;
    }

    @Getter
    @Setter
    @Id
    @GeneratedValue
    private Long id;

    @Getter
    @Setter
    @Column(name = "hash")
    private String hash;

    @Getter
    @Setter
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    @OneToOne(targetEntity = Account.class, cascade = CascadeType.ALL)
    private Account account;

    @Override
    public String toString() {
        return "Password{" +
                "id=" + id +
                ", hash='" + hash + '\'' +
                ", account=" + account +
                '}';
    }
}
