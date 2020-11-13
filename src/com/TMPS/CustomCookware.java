package com.TMPS;

import com.TMPS.Cookware.ICookware;
import com.TMPS.Factory.IBaseFactory;
import com.TMPS.Wrapper.BaseCookwareFactoryDecorator;
import com.TMPS.Wrapper.CustomVolume;

public class CustomCookware {
    private final IBaseFactory baseFactory;

    public CustomCookware(IBaseFactory baseFactory) {
        this.baseFactory = baseFactory;
    }

    public ICookware getCustomCookware(String type, float volume, String materialType) {
        BaseCookwareFactoryDecorator customizer = new CustomVolume(volume, baseFactory);
        ICookware customCookware = customizer.createCookware(type);
        customCookware.setMaterialType(materialType);
        return customCookware;
    }
}
