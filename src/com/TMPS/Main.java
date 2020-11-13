package com.TMPS;

import com.TMPS.Factory.GlassCookwareFactory;
import com.TMPS.Factory.IBaseFactory;
import com.TMPS.Factory.IronCookwareFactory;
import com.TMPS.Factory.SteelCookwareFactory;
import com.TMPS.Stove.AntiqueStove;
import com.TMPS.Stove.ElectricalStove;
import com.TMPS.Stove.GasStove;

public class Main {

    public static void main(String[] args) {
        IBaseFactory glassFactory = GlassCookwareFactory.getGlassCookwareFactory();
        AntiqueStove antiqueStove = new AntiqueStove();
        ElectricalStove electricalStove = new ElectricalStove();
        GasStove gasStove = new GasStove();

        StoveAdapter antiqueStoveAdapter = new StoveAdapter(antiqueStove);
        StoveAdapter electricalStoveAdapter = new StoveAdapter(electricalStove);
        StoveAdapter gasStoveAdapter = new StoveAdapter(gasStove);

        Kitchen kitchen = Kitchen.getKitchen();
        kitchen.arrangeKitchen(antiqueStoveAdapter, electricalStoveAdapter, gasStoveAdapter,
                glassFactory.createCookware("pan"), glassFactory.createCookware("pot"), glassFactory.createCookware("casserole"));

        System.out.println();

        CustomCookware customCookware = new CustomCookware(glassFactory);
        System.out.println(customCookware.getCustomCookware("pan", 5f, "paper"));
        System.out.println(customCookware.getCustomCookware("pot", 10f, "rock"));
        System.out.println(customCookware.getCustomCookware("casserole", 4f, "engraved"));
        System.out.println();
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
