package com.example.orcamentos.Models;

import java.io.Serializable;

public class Material implements Serializable {

    private String material;

    public Material(String material) {

        this.material = material;

    }

    public String getMaterial() {

        return material;

    }

    public void setMaterial(String material) {

        this.material = material;

    }

}
