package com.TMPS;

import com.TMPS.Cookware.ICookware;

import java.util.Iterator;
import java.util.List;

public class CookwareIterator implements Iterator<ICookware> {

    private List<ICookware> cookwares;
    private int i = 0;

    public CookwareIterator(List<ICookware> cookwares) {
        this.cookwares = cookwares;
    }

    @Override
    public boolean hasNext() {
        return (i < cookwares.size() && cookwares.get(i) != null);
    }

    @Override
    public ICookware next() {
        return cookwares.get(i++);
    }
}
