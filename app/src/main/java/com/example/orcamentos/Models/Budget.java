package com.example.orcamentos.Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Budget implements Serializable {

    private String title;

    private Date date;

    private String clientName;

    private String clientContact;

    private String clientEmail;

    private ArrayList<MaterialBudget> material;

    private int workTime;

    private String timeSystem;

    private int travelDistance;

    private float priceTravel;

    private float parking;

    private int laborQuantity;

    private float laborPrice;

    private float discount;

    public Budget(String title, Date date, String clientName, String clientContact, String clientEmail, ArrayList<MaterialBudget> material, int workTime, String timeSystem, int travelDistance, float priceTravel, float parking, int laborQuantity, float laborPrice, float discount) {

        this.title = title;
        this.date = date;
        this.clientName = clientName;
        this.clientContact = clientContact;
        this.clientEmail = clientEmail;
        this.material = material;
        this.workTime = workTime;
        this.timeSystem = timeSystem;
        this.travelDistance = travelDistance;
        this.priceTravel = priceTravel;
        this.parking = parking;
        this.laborQuantity = laborQuantity;
        this.laborPrice = laborPrice;
        this.discount = discount;

    }

    public String getTitle() {

        return title;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    public Date getDate() {

        return date;

    }

    public void setDate(Date date) {

        this.date = date;

    }

    public String getClientName() {

        return clientName;

    }

    public void setClientName(String clientName) {

        this.clientName = clientName;

    }

    public String getClientContact() {

        return clientContact;

    }

    public void setClientContact(String clientContact) {

        this.clientContact = clientContact;

    }

    public String getClientEmail() {

        return clientEmail;

    }

    public void setClientEmail(String clientEmail) {

        this.clientEmail = clientEmail;

    }

    public ArrayList<MaterialBudget> getMaterial() {

        return material;

    }

    public void setMaterial(ArrayList<MaterialBudget> material) {

        this.material = material;

    }

    public int getWorkTime() {

        return workTime;

    }

    public void setWorkTime(int workTime) {

        this.workTime = workTime;

    }

    public String getTimeSystem() {

        return timeSystem;

    }

    public void setTimeSystem(String timeSystem) {

        this.timeSystem = timeSystem;

    }

    public int getTravelDistance() {

        return travelDistance;

    }

    public void setTravelDistance(int travelDistance) {

        this.travelDistance = travelDistance;

    }

    public float getPriceTravel() {

        return priceTravel;

    }

    public void setPriceTravel(float priceTravel) {

        this.priceTravel = priceTravel;

    }

    public float getParking() {

        return parking;

    }

    public void setParking(float parking) {

        this.parking = parking;

    }

    public int getLaborQuantity() {

        return laborQuantity;

    }

    public void setLaborQuantity(int laborQuantity) {

        this.laborQuantity = laborQuantity;

    }

    public float getLaborPrice() {

        return laborPrice;

    }

    public void setLaborPrice(float laborPrice) {

        this.laborPrice = laborPrice;

    }

    public float getDiscount() {

        return discount;

    }

    public void setDiscount(float discount) {

        this.discount = discount;

    }
}
