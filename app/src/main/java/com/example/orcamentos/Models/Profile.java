package com.example.orcamentos.Models;

import java.io.File;
import java.io.Serializable;

public class Profile implements Serializable {

    private String name;

    private String owner;

    private String contact;

    private String email;

    private String address;

    private String postalCode;

    private String location;

    public Profile(String name, String owner, String contact, String email, String address, String postalCode, String location) {

        this.name = name;
        this.owner = owner;
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.postalCode = postalCode;
        this.location = location;

    }

    public Profile(){



    }

    public String getName() {

        return this.name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getOwner() {

        return this.owner;

    }

    public void setOwner(String owner) {

        this.owner = owner;

    }

    public String getContact() {

        return this.contact;

    }

    public void setContact(String contact) {

        this.contact = contact;

    }

    public String getEmail() {

        return this.email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getAddress() {

        return this.address;

    }

    public void setAddress(String address) {

        this.address = address;

    }

    public String getPostalCode() {

        return this.postalCode;

    }

    public void setPostalCode(String postalCode) {

        this.postalCode = postalCode;

    }

    public String getLocation() {

        return this.location;

    }

    public void setLocation(String location) {

        this.location = location;

    }
}
