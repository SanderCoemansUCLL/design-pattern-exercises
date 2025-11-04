package com.example.exercises.stockmarket;

public class InstitutionalInvestor implements Investor {
    private String name;

    public InstitutionalInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Notifying " + name + ": Stock " + stockSymbol + " is now $" + price);
    }
}
