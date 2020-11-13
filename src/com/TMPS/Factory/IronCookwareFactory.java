package com.TMPS.Factory;

import com.TMPS.BuilderDirector;
import com.TMPS.Cookware.Builder.CasseroleBuilder;
import com.TMPS.Cookware.Builder.PanBuilder;
import com.TMPS.Cookware.Builder.PotBuilder;
import com.TMPS.Cookware.ICookware;

public class IronCookwareFactory implements IBaseFactory {
    private static volatile IronCookwareFactory ironCookwareFactory;
    private BuilderDirector director = new BuilderDirector();

    private IronCookwareFactory() {}

    public static IronCookwareFactory getIronCookwareFactory() {
        if(ironCookwareFactory == null)
            ironCookwareFactory = new IronCookwareFactory();
        return ironCookwareFactory;
    }

    @Override
    public ICookware createCookware(String type) {
        switch(type) {
            case "pot":
                PotBuilder potBuilder = new PotBuilder();
                director.makeIronPot(potBuilder);
                return potBuilder.getCookware();
            case "pan":
                PanBuilder panBuilder = new PanBuilder();
                director.makeIronPan(panBuilder);
                return panBuilder.getCookware();
            case "casserole":
                CasseroleBuilder casseroleBuilder = new CasseroleBuilder();
                director.makeIronCasserole(casseroleBuilder);
                return casseroleBuilder.getCookware();
            default:
                return null;
        }
    }

}
