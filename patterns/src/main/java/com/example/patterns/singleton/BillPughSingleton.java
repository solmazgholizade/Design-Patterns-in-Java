package com.example.patterns.singleton;

import java.io.Serializable;

public class BillPughSingleton implements Serializable {
    private static final long serialVersionUID = -3676939633870466423L;

    private BillPughSingleton() {
    }

    private static class Holder {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return Holder.instance;
    }

    public Object readResolve() {
        return getInstance();
    }

}
