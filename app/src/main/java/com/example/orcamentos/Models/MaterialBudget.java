package com.example.orcamentos.Models;

import java.io.Serializable;

public class MaterialBudget implements Serializable {

    private Material material;

    private Area area;

    private Unit unit;

    private float priceUnit;

    private float quantity;

    public MaterialBudget(Material material, Area area, Unit unit, float priceUnit, float quantity) {

        this.material = material;
        this.area = area;
        this.unit = unit;
        this.priceUnit = priceUnit;
        this.quantity = quantity;

    }

    public Material getMaterial() {

        return material;

    }

    public void setMaterial(Material material) {

        this.material = material;

    }

    public Area getArea() {

        return area;

    }

    public void setArea(Area area) {

        this.area = area;

    }

    public Unit getUnit() {

        return unit;

    }

    public void setUnit(Unit unit) {

        this.unit = unit;

    }

    public float getPriceUnit() {

        return priceUnit;

    }

    public void setPriceUnit(float priceUnit) {

        this.priceUnit = priceUnit;

    }

    public float getQuantity() {

        return quantity;

    }

    public void setQuantity(float quantity) {

        this.quantity = quantity;

    }

}
