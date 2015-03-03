/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2D1.Lect.HM;

/**
 *
 * @author Gude
 */
public class Car {
    private int x = 1;
    private int y = 1;

    public static void moveUp(Car This, int u) {
        This.y +=  u;
    }

    public static void moveDown(Car This, int d) {
        This.y -= d;
    }

    public static void moveRight(Car This, int r) {
        This.x += r;
    }

    public static void moveLeft(Car This, int l) {
        This.x -= l;

    }

    public static String returnLocation(Car This) {
        return "(" + This.x + "," + This.y + ")";
    }

}
