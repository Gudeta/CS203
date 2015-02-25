/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs203;

/**
 *
 * @author Gude
 */
public class Car {

    private int x = 0;
    private int y = 0;

    public void moveUp() {
        this.y += 1;
    }
    public void moveDown() {
        this.y -=1;
    }
    public void moveRight() {
        this. x += 1;
    }
        public void moveLeft() {
        this. x -= 1;
     
    }
    public void printLocation() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

}
