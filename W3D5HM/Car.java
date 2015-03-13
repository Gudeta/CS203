/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3D4Serialization;

import java.io.*;

/**
 *
 * @author Gude
 */
public class Car implements Serializable {    
    private int x = 0;
    private int y = 0;
    private String model;
    
    Car(String model) {
        this.model = model;
    }

    public void moveUp() {
        this.y += 2;
    }
    public void moveDown() {
        this.y -=2;
    }
    public void moveRight() {
        this. x += 2;
    }
        public void moveLeft() {
        this. x -= 2;
     
    }
    public void printLocation() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }
    
    public String getModel() {
        return this.model;
    }
    
    

}
