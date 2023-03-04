package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bazaochi Dumitru - Lab 1,2 - Crearea de clase cu mostenire, interfata, metode abstracte");

        Transport transport = new Transport("Toyota", 100) {
            double calculateTravelTime() {
                return 60;
            }
        };

        System.out.println("======================================================");
        System.out.println("Automobil 1");
        System.out.println("Nume: " + transport.getName());
        System.out.println("Viteza: " + transport.getSpeed());
        System.out.println("Timp de calatorie: " + transport.calculateTravelTime());

        Autobus autobus = new Autobus("Man", 80, 40);

        System.out.println("======================================================");
        System.out.println("Automobil 2");
        System.out.println("Nume: " + autobus.getName());
        System.out.println("Viteza: " + autobus.getSpeed());
        System.out.println("MaxPasageri: " + autobus.getMaxPassengerCapacity());
        System.out.println("Timp de calatorie: " + autobus.calculateTravelTime());
        autobus.alarma();
    }
}