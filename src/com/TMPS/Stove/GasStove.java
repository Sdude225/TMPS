package com.TMPS.Stove;

public class GasStove implements IStove {
    private String name = "gas stove";
    private String company = "Tefal";
    private float price = 1499f;

    @Override
    public void setName(String name) { this.name = name;}

    @Override
    public void setCompany(String company) { this.company = company;}

    @Override
    public void setPrice(float price) { this.price = price;}

    @Override
    public String toString() {
        return "Gas stove = " + name + ", company = " + company + ", price = " + price;
    }
}
