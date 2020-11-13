package com.TMPS;

import com.TMPS.Stove.IStove;

public class StoveAdapter extends AdapterUtility{
    private final IStove stove;

    public StoveAdapter(IStove stove) {
        this.stove = stove;
    }

    @Override
    public String toString() {
        return stove.toString();
    }
}
