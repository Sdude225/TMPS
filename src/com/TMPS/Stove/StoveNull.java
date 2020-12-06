package com.TMPS.Stove;

public class StoveNull implements IStove{
    @Override
    public void setName(String name) {
        System.out.println("can\'t set name to null stove object");
    }

    @Override
    public void setCompany(String company) {
        System.out.println("can\'t set company name to null stove object");
    }

    @Override
    public void setPrice(float price) {
        System.out.println("can\'t set price to null stove object");
    }
}
