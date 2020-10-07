package com.TMPS;

import com.TMPS.Cookware.Builder.CasseroleBuilder;
import com.TMPS.Cookware.Builder.ICookwareBuilder;
import com.TMPS.Cookware.Builder.PanBuilder;
import com.TMPS.Cookware.Builder.PotBuilder;

public class BuilderDirector {

    public ICookwareBuilder makeIronPan(PanBuilder builder) {
        builder.reset();
        builder.setName("Ariel");
        builder.setMaterialType("Iron");
        builder.setPrice(100f);
        return builder;
    }

    public ICookwareBuilder makeIronPot(PotBuilder builder) {
        builder.reset();
        builder.setName("Best Pots");
        builder.setMaterialType("Iron");
        builder.setPrice(249f);
        return builder;
    }

    public ICookwareBuilder makeIronCasserole(CasseroleBuilder builder) {
        builder.reset();
        builder.setName("Casa Rol");
        builder.setMaterialType("Iron");
        builder.setPrice(228f);
        return builder;
    }

    public ICookwareBuilder makeSteelPan(PanBuilder builder) {
        builder.reset();
        builder.setName("Steel united");
        builder.setMaterialType("Steel");
        builder.setPrice(339f);
        return builder;
    }

    public ICookwareBuilder makeSteelPot(PotBuilder builder) {
        builder.reset();
        builder.setName("Pawt");
        builder.setMaterialType("Steel");
        builder.setPrice(399f);
        return builder;
    }

    public ICookwareBuilder makeSteelCasserole(CasseroleBuilder builder) {
        builder.reset();
        builder.setName("Margaret");
        builder.setMaterialType("Steel");
        builder.setPrice(1099f);
        return builder;
    }

    public ICookwareBuilder makeGlassPan(PanBuilder builder) {
        builder.reset();
        builder.setName("Glassgow");
        builder.setMaterialType("Glass");
        builder.setPrice(666f);
        return builder;
    }

    public ICookwareBuilder makeGlassPot(PotBuilder builder) {
        builder.reset();
        builder.setName("Noah");
        builder.setMaterialType("Glass");
        builder.setPrice(1999f);
        return builder;
    }

    public ICookwareBuilder makeGlassCasserole(CasseroleBuilder builder) {
        builder.reset();
        builder.setName("Teffal");
        builder.setMaterialType("Glass");
        builder.setPrice(1989f);
        return builder;
    }
}
