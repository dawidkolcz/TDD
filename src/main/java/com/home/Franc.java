package com.home;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiply) {
        return new Franc(amount * multiply);
    }

    @Override
    public boolean equals(Object object){
        Franc franc = (Franc)object;
        return amount == franc.amount;
    }
}
