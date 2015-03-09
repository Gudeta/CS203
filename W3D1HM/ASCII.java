/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3D1HM;

import java.util.Calendar;

/**
 *
 * @author Gude
 */
public class ASCII {

    public static void main(String[] args) {
        Calendar C1 = Calendar.getInstance();
        System.out.printf("%-4s%-4s%-4s%-4s", ""
                + "Dec", "Hex", "Oct", "Char");
        System.out.printf("\n");

        for (int i = 32; i <= 128; i++) {
            System.out.printf("%-4d", i);
            System.out.printf("%-4x", i);
            System.out.printf("%-4o", i);
            System.out.printf("%-4c", i);
            System.out.printf("\n");
        }

    }

}
