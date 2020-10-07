package com.TMPS.Cookware;

public class Pan implements ICookware {
    private String name;
    private String type;
    private float price;

    public void setName(String name) {
        this.name = name;
    }

    public void setMaterialType(String type) {
        this.type = type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pan : " + "name = " + name + ", type = " + type + ", price = " + price;
    }
}
