package com.virtualBank;

import javax.persistence.*;

/**
 * Created by Brice on 2/17/17.
 */

@Entity
@Table(name = "savings")
public class Saving {

    @Id
    @GeneratedValue
    int savingId;

    @Column
    double amount;

    @Column
    double interestRate;

    @ManyToOne
    Client client;

    public Saving() {
    }

    public Saving(double amount, double interestRate, Client client) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.client = client;
    }

    public int getSavingId() {
        return savingId;
    }

    public void setSavingId(int savingId) {
        this.savingId = savingId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
