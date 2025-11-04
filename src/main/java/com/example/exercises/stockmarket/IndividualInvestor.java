package com.example.exercises.stockmarket;

public class IndividualInvestor implements Investor {
    private String name;

    public IndividualInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Notifying " + name + ": Stock " + stockSymbol + " is now $" + price);
    }
}
