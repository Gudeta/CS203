/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3D1HM;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Gude
 */
public class MyBirthday {
    public static void main(String[] args){
        Calendar c1 = Calendar.getInstance();
        c1.set(1992, 0, 9, 6, 20);
        System.out.printf("My Birthday's date and time is :\n \t \t "+ c1.getTime()+"." );
        
    }
}
