/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2D3HM;

/**
 *
 * @author Gude
 */
public abstract class Vehicles {

    private int x;
    private int y;
    protected int speed;
    private double direction;

    public void move(int amount) {
        x += Math.cos(direction + amount) * speed;
        y += Math.sin(direction + amount) * speed;
    }

    public void turns(int amount) {
        if ((direction + amount) < 360 && (direction + amount) > 0) {
            direction += amount;
        }
    }

    public abstract void accerelate();

    public abstract void brake();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
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

    public void setDirection(int direction) {
        this.direction = direction;
    }

}
