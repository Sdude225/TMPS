package com.TMPS.Wrapper;

import com.TMPS.Cookware.ICookware;
import com.TMPS.Factory.IBaseFactory;

public class CustomVolume extends BaseCookwareFactoryDecorator{
    private final float customVolume;


    public CustomVolume(float customVolume, IBaseFactory baseFactory) {
        super(baseFactory);
        this.customVolume = customVolume;
    }

    @Override
    public ICookware createCookware(String type) {
        ICookware cookware = super.createCookware(type);
        cookware.setVolume(this.customVolume);
        return cookware;
    }
}
