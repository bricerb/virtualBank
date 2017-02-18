package com.virtualBank;

import javax.persistence.*;

/**
 * Created by Brice on 2/17/17.
 */

@Entity
@Table(name = "banks")
public class Bank {

    @Id
    @GeneratedValue
    int bankId;

    @Column
    String name;

    @OneToMany
    Client client;

    public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
