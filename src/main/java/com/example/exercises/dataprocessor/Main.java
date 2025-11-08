package com.example.exercises.dataprocessor;

public class Main {
    public static void main(String[] args) {
        DataProcessor jsonProcessor = new JSONProcessor();
        jsonProcessor.process();

        DataProcessor csvProcessor = new CSVProcessor();
        csvProcessor.process();
    }
}
