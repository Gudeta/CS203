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
public class GarageTestDrive {
    public static void main(String[] args){
     //   Car firstCar = new Car("Acura");
        Truck firstTruck = new Truck("chevy");
        Item first = new Item("first");
        Item second = new Item("Second");
        Item third = new Item("thrird");
        Garage obj = new Garage();
      //  obj.store(firstCar);
        System.out.println(obj.retrieve().getModel());
        obj.store(firstTruck);
        obj.store(first);
        obj.store(second);
        System.out.println(obj.retrieve(0).getName());
        System.out.println(obj.retrieve(1).getName());
    }
}  
