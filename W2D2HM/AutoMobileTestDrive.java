/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2D2HM;
import java.util.ArrayList;
/**
 *
 * @author Gude
 */
public class AutoMobileTestDrive {
    
    public static void main(String[] args) {
        
        ArrayList<AutoMobile> autoList = new ArrayList<> ();
        
        Truck firstTruck = new Truck("Chevy", "Xyz", 120, 2015,"Blue");
        Truck secondTruck = new Truck("Volvo", "volvoXXX", 100, 2005,"gREEN");
        
        Car firstCar= new Car("Acura", "Sedan", 180, 2003,"White");
        System.out.println(firstCar.getModel());
        Car secondCar = new Car("BMW", "ZzZzz", 190, 2025,"Blue-Black");
        System.out.println(secondCar.getColor());
        Car thirdCar = new Car("Ford","Exscape", 100, 1990, "Black");
        System.out.println(thirdCar.getMake());
        System.out.println(thirdCar.getModel());
        System.out.println(thirdCar.getYear());
        System.out.println(thirdCar.getcolor());
        
        
        autoList.add(firstTruck);
        autoList.add(secondTruck);
        autoList.add(firstCar);
        autoList.add(secondCar);
        autoList.add(thirdCar);
        
        autoList.stream().forEach((vehicle) -> {
            int i = 0;
            for( int t =0; i < 3 ; i++){
                vehicle.accelerate();
                vehicle.brake();
            }
        });

       
    }
}
