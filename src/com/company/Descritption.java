package com.company;

public class Descritption {
    private String description;

    public Descritption(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description.strip();
    }

    @Override
    public String toString() {
        return
                "description is " + description ;
    }
}
