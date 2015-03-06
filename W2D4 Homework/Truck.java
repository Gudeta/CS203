/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.W2D2HMreview;

/**
 *
 * @author Gude
 */
public class Truck extends Automobile {

    private boolean hasTailGate;
    private int caryingCapacity;

    public Truck(boolean hasTailGate, int caryingCapacity, String make, 
            String model, int year, String color) {
        super(make, model, year, color);
        this.hasTailGate = hasTailGate;
        this.caryingCapacity = caryingCapacity;
    }

    public Truck(int caryingCapacity, String make, String model,
            int year, String color) {
        super(make, model, year, color);
        this.caryingCapacity = caryingCapacity;
    }

    public Truck(int caryingCapacity, String make, String model) {
        super(make, model);
        this.caryingCapacity = caryingCapacity;
    }

    @Override
    public void accelerate() {
        speed += 7;
    }

    public boolean isHasTailGate() {
        return hasTailGate;
    }

    public void setHasTailGate(boolean hasTailGate) {
        this.hasTailGate = hasTailGate;
    }

    public int getCaryingCapacity() {
        return caryingCapacity;
    }

    public void setCaryingCapacity(int caryingCapacity) {
        this.caryingCapacity = caryingCapacity;
    }

}
