package com.TMPS.Factory;

import com.TMPS.BuilderDirector;
import com.TMPS.Cookware.Builder.CasseroleBuilder;
import com.TMPS.Cookware.Builder.PanBuilder;
import com.TMPS.Cookware.Builder.PotBuilder;
import com.TMPS.Cookware.ICookware;
import com.TMPS.Cookware.Pot;

public class SteelCookwareFactory implements IBaseFactory {
    private static SteelCookwareFactory steelCookwareFactory;
    private BuilderDirector director = new BuilderDirector();

    private SteelCookwareFactory() {}

    public static SteelCookwareFactory getSteelCookwareFactory() {
        if(steelCookwareFactory == null)
            steelCookwareFactory = new SteelCookwareFactory();
        return steelCookwareFactory;
    }

    @Override
    public ICookware createCookware(String type) {
        switch (type) {
            case "pot":
                PotBuilder potBuilder = new PotBuilder();
                director.makeSteelPot(potBuilder);
                return potBuilder.getCookware();
            case "pan":
                PanBuilder panBuilder = new PanBuilder();
                director.makeSteelPan(panBuilder);
                return panBuilder.getCookware();
            case "casserole":
                CasseroleBuilder casseroleBuilder = new CasseroleBuilder();
                director.makeSteelCasserole(casseroleBuilder);
                return casseroleBuilder.getCookware();
            default:
                return null;
        }
    }
}
