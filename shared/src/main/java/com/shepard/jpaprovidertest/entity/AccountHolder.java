package com.shepard.jpaprovidertest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "account_holder")
@Cacheable(false)
public class AccountHolder {

    public AccountHolder() {
    }

    public AccountHolder(Long id, List<Account> accounts) {
        this.id = id;
        this.accounts = accounts;
    }

    @Getter
    @Setter
    @Id
    @GeneratedValue
    private Long id;

    @Getter
    @Setter
    @OneToMany(targetEntity = Account.class, fetch = FetchType.EAGER)
    private List<Account> accounts;

    @Override
    public String toString() {
        return "AccountHolder{" +
                "id=" + id +
                ", accounts=" + accounts +
                '}';
    }
}
