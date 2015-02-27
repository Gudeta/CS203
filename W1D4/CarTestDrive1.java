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
public class CarTestDrive1 {
    public static void main(String[] args){
        Car1 myCar = new Car1();
        myCar.moveDown(5);
        System.out.println(myCar.returnLocation());
        
        myCar.moveRight(8);
        System.out.println(myCar.returnLocation());
        
        myCar.moveUp(20);
        System.out.println(myCar.returnLocation());
        
        myCar.moveLeft(12);        
        System.out.println(myCar.returnLocation());
    }
    
}
    
