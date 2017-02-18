package com.virtualBank;

import javax.persistence.*;

/**
 * Created by Brice on 2/17/17.
 */

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue
    int clientId;

    @Column
    String firstName;

    @Column
    String lastName;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
