package com.TMPS;

import com.TMPS.Cookware.ICookware;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Kitchen implements IIteratorCollection{
    private static volatile Kitchen kitchen;
    private List<ICookware> cookwareList;

    private Kitchen() {
        cookwareList = new ArrayList<>();
    }

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

    public boolean addCookware(ICookware cookware) {
        return cookwareList.add(cookware);
    }

    public List<ICookware> getCookwareList() {
        return cookwareList;
    }

    @Override
    public Iterator<ICookware> iterator() {
        return new CookwareIterator(cookwareList);
    }
}
