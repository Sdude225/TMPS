package com.TMPS.Cookware;

public class CookwareNull implements ICookware{
    @Override
    public void setName(String name) {
        System.out.println("can\'t set name to null cookware object");
    }

    @Override
    public void setMaterialType(String type) {
        System.out.println("can\'t set type to null cookware object");
    }

    @Override
    public void setPrice(float price) {
        System.out.println("can\'t set price to null cookware object");
    }

    @Override
    public void setVolume(float volume) {
        System.out.println("can\'t set volume to null cookware object");
    }
}
