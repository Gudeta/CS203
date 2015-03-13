/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3D4Serialization;

import java.io.*;
import W3D4Serialization.Car;

/**
 *
 * @author Gude
 */
public class CarTestDrive {
    public static void main(String[] args) throws ClassNotFoundException{
        Car toyota = new Car("Toyota");
        Car honda = new Car("Honda");
        Car mercedes = new Car("Mercedes");
        
        try{
           ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Car.ser"));
           os.writeObject(toyota);
           os.writeObject(honda);
           os.writeObject(mercedes);
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        toyota = null;
        honda = null;
        mercedes = null;
        
        try{
           ObjectInputStream is = new ObjectInputStream(new FileInputStream("Car.ser"));
           Car firstCar = (Car) is.readObject();
           Car secondCar = (Car) is.readObject();
           Car thirdCar =  (Car) is.readObject();
           
           System.out.println(firstCar.getModel());
           System.out.println(secondCar.getModel());
           System.out.println(thirdCar.getModel());
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
