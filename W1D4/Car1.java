/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W1D4;

/**
 *
 * @author Gude
 */

/**
 *
 * @author Gude
 */
public class Car1 {

    private int x = 10;
    private int y = 10;
    
    

    public void moveUp(int u) {
        this.y += u;
    }
    public void moveDown(int d) {
        this.y -=d;
    }
    public void moveRight(int r) {
        this. x += r;
    }
        public void moveLeft(int l) {
        this. x -= l;
     
    }
    public String returnLocation() {
        return "(" + this.x + "," + this.y + ")";
    }

}


