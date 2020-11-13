package com.TMPS.Factory;

import com.TMPS.BuilderDirector;
import com.TMPS.Cookware.Builder.CasseroleBuilder;
import com.TMPS.Cookware.Builder.PanBuilder;
import com.TMPS.Cookware.Builder.PotBuilder;
import com.TMPS.Cookware.ICookware;

public class GlassCookwareFactory implements IBaseFactory {
    private static volatile GlassCookwareFactory glassCookwareFactory;
    private BuilderDirector director = new BuilderDirector();

    public static GlassCookwareFactory getGlassCookwareFactory() {
        if(glassCookwareFactory == null)
            glassCookwareFactory = new GlassCookwareFactory();
        return glassCookwareFactory;
    }

    private GlassCookwareFactory() {}

    @Override
    public ICookware createCookware(String type) {
        switch(type) {
            case "pot":
                PotBuilder potBuilder = new PotBuilder();
                director.makeGlassPot(potBuilder);
                return potBuilder.getCookware();
            case "pan":
                PanBuilder panBuilder = new PanBuilder();
                director.makeGlassPan(panBuilder);
                return panBuilder.getCookware();
            case "casserole":
                CasseroleBuilder casseroleBuilder = new CasseroleBuilder();
                director.makeGlassCasserole(casseroleBuilder);
                return casseroleBuilder.getCookware();
            default:
                return null;
        }
    }
}
