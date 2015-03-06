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
public class Car extends Automobile {
    private boolean convertable;
    private int trunkCapacity;

    public Car(boolean convertable, int trunkCapacity, String make, String model, int year, String color) {
        super(make, model, year, color);
        this.convertable = convertable;
        this.trunkCapacity = trunkCapacity;
    }

    public Car(int trunkCapacity, String make, String model, int year, String color) {
        super(make, model, year, color);
        this.trunkCapacity = trunkCapacity;
    }

    public Car(int trunkCapacity, String make, String model) {
        super(make, model);
        this.trunkCapacity = trunkCapacity;
    }
    
    
    @Override
    public void accelerate() {
        speed += 12;
    }
    
    public boolean isConvertable() {
        return convertable;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }
}
