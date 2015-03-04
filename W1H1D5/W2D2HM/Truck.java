/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2D2HM;

/**
 *
 * @author Gude
 */
public class Truck extends AutoMobile {
    
    private int carryingCapacity;
    public boolean hasTailGate;

    
    Truck(String make, String Model, int speed, int year, String color) {
        super(make, Model,speed,year, color);
    }

    Truck(String chevy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void accelerate() {
        this.speed += 7;
    }
    
}