package com.TMPS.Factory;

import com.TMPS.Cookware.ICookware;

public interface IBaseFactory {

    ICookware createCookware(String type);
}
