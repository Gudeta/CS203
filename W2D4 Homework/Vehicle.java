/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2D4;

/**
 *
 * @author Gude
 */
public class Vehicle {

    private double x;
    private double y;
    protected int speed = 0;
    private double direction;
    
    public Vehicle(){
        
    }
    
    public Vehicle(double x, double y, double direction){
       this.x = x;
       this.y = y;
       this.direction = direction;
    }
    
    public Vehicle(double x, double y){
        this.x = x;
        this.y = y;
    }
    

    public void move(int amount) {
        x += Math.cos(direction + amount) * speed;
        y += Math.sin(direction + amount) * speed;
    }

    public void turns(int amount) {
        if ((direction + amount) < 360 && (direction + amount) > 0) {
            direction += amount;
        }
    }

    //public abstract void accerelate();

    //public abstract void brake();

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

}
