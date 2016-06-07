package com.example.darwinvtomy.ardunosensor;

/**
 * Created by DARWIN V TOMY on 4/22/2016.
 */
public class Product {


    private int id;
    private String name;
    private String weight;
    private String mfgdate;
    private String expdate;
    private double cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getMfgdate() {
        return mfgdate;
    }

    public void setMfgdate(String mfgdate) {
        this.mfgdate = mfgdate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
