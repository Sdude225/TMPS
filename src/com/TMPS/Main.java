package com.TMPS;

import com.TMPS.Factory.GlassCookwareFactory;
import com.TMPS.Factory.IBaseFactory;
import com.TMPS.Factory.IronCookwareFactory;
import com.TMPS.Factory.SteelCookwareFactory;

public class Main {

    public static void main(String[] args) {
        IBaseFactory glassFactory = GlassCookwareFactory.getGlassCookwareFactory();
        System.out.println(glassFactory.createCookware("pan").toString());
        System.out.println(glassFactory.createCookware("pot").toString());
        System.out.println(glassFactory.createCookware("casserole").toString());
        System.out.println();
        IBaseFactory steelFactory = SteelCookwareFactory.getSteelCookwareFactory();
        System.out.println(steelFactory.createCookware("pan").toString());
        System.out.println(steelFactory.createCookware("pot").toString());
        System.out.println(steelFactory.createCookware("casserole").toString());
        System.out.println();
        IBaseFactory ironFactory = IronCookwareFactory.getIronCookwareFactory();
        System.out.println(ironFactory.createCookware("pan").toString());
        System.out.println(ironFactory.createCookware("pot").toString());
        System.out.println(ironFactory.createCookware("casserole").toString());
    }
}
