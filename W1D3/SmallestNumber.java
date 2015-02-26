/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W1D3;

/**
 *
 * @author Gude
 */
public class SmallestNumber {
    public static void main(String[] args){
    
        double i = 0.0;
    
        double[] num =new double[100];
        
        for( i = 0; i < num.length; i++){
            
           num.length[i] = (double) (Math.random() * 100);
        }
        
        double Smallest = num[0];
        for(i=1; i < num.length ; i++){
            if (num[i] < Smallest.nextDouble()); 
                Smallest= num[i];
        }
        System.out.println("The smallest number is : " + Smallest + ". ");
    }
    
}
