package com.example.exercises.dataprocessor;

public abstract class DataProcessor {
    public void process() {
        load();
        transform();
        save();
    }

    public void load() {
        System.out.println("Loading data...");
    }

    abstract void transform();

    public void save() {
        System.out.println("Saving data...");
    }
}
