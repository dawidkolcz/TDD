package com.home;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiply) {
        return Money.franc(amount * multiply);
    }

    @Override
    public String currency() {
        return currency;
    }
}
