package com.example.exercises;

import com.example.exercises.stockmarket.ConcreteStock;
import com.example.exercises.stockmarket.IndividualInvestor;
import com.example.exercises.stockmarket.InstitutionalInvestor;

public class Main {
    public static void main(String[] args) {
        ConcreteStock appleStock = new ConcreteStock("AAPL", 150.00);
        IndividualInvestor john = new IndividualInvestor("John");
        InstitutionalInvestor vanguard = new InstitutionalInvestor("Vanguard");
        appleStock.addInvestor(john);
        appleStock.addInvestor(vanguard);

        appleStock.setPrice(155.00);
        appleStock.setPrice(160.00);

        appleStock.setPrice(165.00);
    }
}