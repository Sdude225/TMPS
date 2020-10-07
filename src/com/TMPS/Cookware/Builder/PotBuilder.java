package com.TMPS.Cookware.Builder;

import com.TMPS.Cookware.Pot;

public class PotBuilder implements ICookwareBuilder {
    private Pot pot;

    public PotBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.pot = new Pot();
    }

    @Override
    public void setName(String name) {
        this.pot.setName(name);
    }

    @Override
    public void setMaterialType(String type) {
        this.pot.setMaterialType(type);
    }

    @Override
    public void setPrice(float price) {
        this.pot.setPrice(price);
    }

    public Pot getCookware() {
        Pot cookware = this.pot;
        this.reset();
        return cookware;
    }
}
