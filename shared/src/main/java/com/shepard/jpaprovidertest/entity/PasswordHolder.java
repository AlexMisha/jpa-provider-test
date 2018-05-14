package com.shepard.jpaprovidertest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "password_holder")
public class PasswordHolder {

    public PasswordHolder() {
    }

    public PasswordHolder(Long id, List<Password> passwords) {
        this.id = id;
        this.passwords = passwords;
    }

    @Getter
    @Setter
    @Id
    @GeneratedValue
    private Long id;

    @Getter
    @Setter
    @OneToMany(targetEntity = Password.class, fetch = FetchType.EAGER)
    private List<Password> passwords;

    @Override
    public String toString() {
        return "PasswordHolder{" +
                "id=" + id +
                ", passwords=" + passwords +
                '}';
    }
}
