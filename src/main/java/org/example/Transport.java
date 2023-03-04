package org.example;

public abstract class Transport {
    // Variabile pentru a stoca informatii despre vehiculul de transport
    private String name;
    private int speed;
    public static final double distance = 100.5;

    // Constructor pentru initializarea numele si viteza vehiculului de transport
    public Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // Getters si setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Metoda abstracta pentru a calcula timpul de calatorie
    abstract double calculateTravelTime();
}
