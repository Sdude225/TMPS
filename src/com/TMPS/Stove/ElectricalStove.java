package com.TMPS.Stove;

public class ElectricalStove implements IStove{
    private String name = "electrical stove";
    private String company = "Lufthansa";
    private float price = 599f;

    @Override
    public void setName(String name) { this.name = name;}

    @Override
    public void setCompany(String company) { this.company = company;}

    @Override
    public void setPrice(float price) { this.price = price;}

    @Override
    public String toString() {
        return "Electrical stove = " + name + ", company = " + company + ", price = " + price;
    }
}
