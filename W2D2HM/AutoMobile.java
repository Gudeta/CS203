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
public class AutoMobile {

    private String make;
    private String Model;
    protected int speed;
    private int year;
    private String color;
    
    AutoMobile(){
        
    }
    
    AutoMobile(String model){
        this.Model = model;
    }
    
    AutoMobile(String model, String color) {
        this.Model = model;
        this.color = color;
      
    }
    
    AutoMobile(String make, String Model,int speed,int year, String color ){
        this.make = make;
        this.Model = Model; 
        this.speed = speed;
        this.year= year;
        this.color=color;
        }
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getMake() {
        return make;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setYear(int year) {
        this.year = year;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void accelerate() {
        this.speed += 10;
        System.out.println("Increased speed ");
    }

    public void brake() {
        if (this.speed >= 10) {
            this.speed -= 10;
            System.out.println("Decreased speed ");

        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

}
