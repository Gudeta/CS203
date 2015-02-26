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
public class SumOfEven {
    public static void main(String[] args){
        int i = 0; 
        int[] nums = {3,8,4,10,14,5,21};
                
        int sum =0;

         for(i = 0; i < nums.length; i++){
             if (nums[i] % 2 == 0)
                 sum = sum + nums[i];
         }
         
         System.out.println("The sum of even numbers is " + sum +".");
         
        
    }
    
}
