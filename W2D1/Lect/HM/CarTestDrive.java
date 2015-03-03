/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2D1.Lect.HM;

/**
 *
 * @author Gude
 */
public class CarTestDrive {
    public static void main(String[] args){
        Car myCar = new Car();
        Car.moveDown(myCar, 1);
        System.out.println(myCar.returnLocation(myCar));
        
        myCar.moveRight(myCar, 3);
        System.out.println(myCar.returnLocation(myCar));
        
        myCar.moveUp(myCar, 0);
        System.out.println(myCar.returnLocation(myCar));
        
        myCar.moveLeft(myCar, 3);        
        System.out.println(myCar.returnLocation(myCar));
    }
    
    
}
