package com.company;

import java.time.LocalDate;
import java.time.Period;

public class Car {
    public static final double MIN_ENGINE_VOLUME = 0.5;
    private String brand;
    private LocalDate producedIn;
    private String color;
    private String condition;
    private double engineCapacity;
    private String fuelType;
    private int mileage;

    public Car(String brand, LocalDate producedin, String color, String condition, double enginecapacity, String fueltype, int mileage) {
        this.setBrand(brand);
        this.setColor(color);
        this.setCondition(condition);
        this.setEngineCapacity(enginecapacity);
        this.setFuelType(fueltype);
        this.setMileage(mileage);
        this.setProducedIn(producedin);
    }

    public Car() {
    }

    public String trashCleaner(String messy) {
        String[] mess = messy.strip().split(" ");
        String cleaned = "";
        for (String word : mess) {
            cleaned += word.length()>0?word + " ":"";
        }
        return cleaned.strip();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = trashCleaner(brand);
    }

    public LocalDate getProducedIn() {
        return producedIn;
    }

    public void setProducedIn(LocalDate producedIn) {
        this.producedIn = Period.between(producedIn, LocalDate.now()).isNegative() ? LocalDate.now() : producedIn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = trashCleaner(color);
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = trashCleaner(condition);
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity > MIN_ENGINE_VOLUME ? engineCapacity : MIN_ENGINE_VOLUME;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = trashCleaner(fuelType);
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage > 0 ? mileage : 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand is'" + brand + '\'' +
                ", produced in " + producedIn +
                ", color is'" + color + '\'' +
                ", condition is '" + condition + '\'' +
                ", engine capacity is" + engineCapacity + " liters" +
                ", fuel type is'" + fuelType + '\'' +
                ", mileage is " + mileage +
                '}';
    }
}
