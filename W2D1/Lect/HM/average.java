/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2D1.Lect.HM;
import java.util.ArrayList;
/**
 *
 * @author Gude
 */
public class average {
    public static void main(String[] args){
        ArrayList<Integer> ints = new ArrayList<Integer> ();
            for( int i = 0; i <= 100; i++){
                double x =  Math.random()*100;
                //System.out.println((int) x);
                ints.add((int)x);
                
            }
            double sum =0.0;
            for(int i = 0; i <ints.size(); i++){
                sum += ints.get(i);
             
            }
            System.out.println(sum);
            
            System.out.println("The average is: " + sum/100);
        
        
    }
    
}
