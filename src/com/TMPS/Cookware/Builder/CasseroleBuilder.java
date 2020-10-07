package com.TMPS.Cookware.Builder;

import com.TMPS.Cookware.Casserole;

public class CasseroleBuilder implements ICookwareBuilder {
    private Casserole casserole;

    public CasseroleBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.casserole = new Casserole();
    }

    @Override
    public void setName(String name) {
        this.casserole.setName(name);
    }

    @Override
    public void setMaterialType(String type) {
        this.casserole.setMaterialType(type);
    }

    @Override
    public void setPrice(float price) {
        this.casserole.setPrice(price);
    }

    public Casserole getCookware() {
        Casserole cookware = this.casserole;
        this.reset();
        return cookware;
    }
}
