package com.TMPS;

import com.TMPS.Cookware.ICookware;

public class Kitchen {
    private static volatile Kitchen kitchen;

    private Kitchen() { }

    public static Kitchen getKitchen() {
        if (kitchen == null)
            kitchen = new Kitchen();
        return kitchen;
    }

    void assembleKitchen(ICookware... cookwares) {
        System.out.println("Kitchen contains following cookware");
        for (ICookware cookware : cookwares) {
            System.out.println(cookware.toString());
        }
    }
}
