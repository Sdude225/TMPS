package com.TMPS.Cookware.Builder;

import com.TMPS.Cookware.Pan;

public class PanBuilder implements ICookwareBuilder {
    private Pan pan;

    public PanBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.pan = new Pan();
    }

    @Override
    public void setName(String name) {
        this.pan.setName(name);
    }

    @Override
    public void setMaterialType(String type) {
        this.pan.setMaterialType(type);
    }

    @Override
    public void setPrice(float price) {
        this.pan.setPrice(price);
    }

    public Pan getCookware() {
        Pan cookware = this.pan;
        this.reset();
        return cookware;
    }
}
