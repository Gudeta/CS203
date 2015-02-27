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
public class TestComparison {
    public static void main(String[] args){
        byte b = 5;
        short s = 5;
        int i = 5;
        long L= 5;
        float f = 5.0f;
        double d = 5.0;
               
        System.out.println(b == s);
        System.out.println(b == i);
        System.out.println(b == b);
        System.out.println(s == i);
        System.out.println(f == d);
        System.out.println(b == d +i);
        System.out.println();
        
        String s1="Mi";
        String s2 = "Mi";
        String s3 = "MiMi";
        String s4 = s3;  
        
        System.out.println(s1);
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s3 == s1+ s2);

    }
    
}
