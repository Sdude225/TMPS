package com.TMPS.Wrapper;

import com.TMPS.Cookware.ICookware;
import com.TMPS.Factory.IBaseFactory;

public class BaseCookwareFactoryDecorator {
    protected IBaseFactory wrapper;

    public BaseCookwareFactoryDecorator(IBaseFactory baseFactory) {
        this.wrapper = baseFactory;
    }

    public ICookware createCookware(String type) {
        return  wrapper.createCookware(type);
    }
}
