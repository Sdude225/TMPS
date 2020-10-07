package com.TMPS.Cookware.Builder;

public interface ICookwareBuilder {
    void reset();
    void setName(String name);
    void setMaterialType(String type);
    void setPrice(float price);
}
