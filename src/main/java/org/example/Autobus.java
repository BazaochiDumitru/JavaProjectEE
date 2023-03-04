package org.example;

public class Autobus extends Transport implements InterfaceTransport{
    // Variabile pentru a stoca informatii despre autobuz
    private int maxPassengerCapacity;

    // Constructor pentru initializarea numele si viteza autobuzului, precum si capacitatea maxima de pasageri
    public Autobus(String name, int speed, int maxPassengerCapacity) {
        // super initializam ceea ce a fost in clasa principala, this ceea ce e nou pentu clasa autobus
        super(name, speed);
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    // Getters si setters
    public int getMaxPassengerCapacity() {
        return maxPassengerCapacity;
    }

    public void setMaxPassengerCapacity(int maxPassengerCapacity) {
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    // Implementarea metodei abstracte calculateTravelTime din clasa Transport
    double calculateTravelTime() {
        // Calcularea timpului de calatorie estimat pentru autobuz
        double travelTime = distance / getSpeed() * 60;
        return travelTime;
    }

    // Implemetarea metodei din interfata
    public void alarma() {
        System.out.println("Alarma de la: " + getName());
    }
}
