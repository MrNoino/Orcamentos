package com.example.orcamentos.Models;

import java.io.Serializable;

public class Area implements Serializable {

    private String area;

    public Area(String area) {

        this.area = area;

    }

    public String getArea() {

        return area;

    }

    public void setArea(String area) {

        this.area = area;

    }

}
