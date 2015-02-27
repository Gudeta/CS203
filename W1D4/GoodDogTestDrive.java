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
public class GoodDogTestDrive {
    public static void main(String[] args){
        GoodDog one =new GoodDog();
        one.setSize(70);
        GoodDog two =new GoodDog();
        two.setSize(8);
        
        System.out.print("Dog one: " + one.getSize()+ "... ");
        one.bark();
        
        System.out.print("Dog two: " + two.getSize()+ "...");
        two.bark();

    }
}
