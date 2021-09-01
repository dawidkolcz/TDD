package com.home;

public interface Expression {
    Money reduce(String to);
    Money reduce(Bank bank, String to);
}
