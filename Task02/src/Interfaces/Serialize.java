package Interfaces;

import java.io.Serializable;

public class Serialize implements Serializable {
    String model,type,power,fuel;
    int seats;

    public Serialize(String model, String type, String power, String fuel, int seats) {
        this.model = model;
        this.type = type;
        this.power = power;
        this.fuel = fuel;
        this.seats = seats;
    }
}
