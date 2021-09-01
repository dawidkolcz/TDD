package com.home;

class Money implements Expression{
    protected int amount;
    protected String currency;

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    Expression times(int multiply){
        return new Money(amount * multiply, currency);
    }

    @Override
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    String currency(){
        return currency;
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Money reduce(String to){
        int rate = (currency.equals("CHF") && to.equals("USD"))
                ? 2
                : 1;
        return new Money(amount / rate, to);
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }
}
