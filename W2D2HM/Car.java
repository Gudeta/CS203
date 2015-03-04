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
public class Car extends AutoMobile {

    private boolean convertable;
    private int trunkCapacity;
    
   // Car(){
        
    //}
    Car() {
        
    }
   
    
    Car(String make, String Model, int speed, int year, String color) {
        super(make, Model, speed, year, color);
    }

    @Override
    public void accelerate() {
        this.speed = this.speed  + 12;
    }

    boolean getcolor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
