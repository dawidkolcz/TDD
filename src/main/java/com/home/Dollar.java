package com.home;

public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiply) {
        return new Dollar(amount * multiply);
    }

    @Override
    public boolean equals(Object object){
        Dollar dollar = (Dollar)object;
        return amount == dollar.amount;
    }
}
