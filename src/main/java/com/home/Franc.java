package com.home;

public class Franc extends Money{
    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiply) {
        return new Franc(amount * multiply);
    }
}
