package com.TMPS.Stove;

public class AntiqueStove implements IStove{
    private String name = "antique stove";
    private String company = "Dutch's stoves";
    private float price = 4998f;

    @Override
    public void setName(String name) { this.name = name;}

    @Override
    public void setCompany(String company) { this.company = company;}

    @Override
    public void setPrice(float price) { this.price = price;}

    @Override
    public String toString() {
        return "Antique stove = " + name + ", company = " + company + ", price = " + price;
    }
}
