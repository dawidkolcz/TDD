package com.home;

public class Dollar extends Money{
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiply) {
        return new Dollar(amount * multiply);
    }
}
