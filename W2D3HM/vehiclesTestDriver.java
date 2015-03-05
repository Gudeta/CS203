/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2D3HM;

import java.util.*;

/**
 *
 * @author Gude
 */
public class vehiclesTestDriver {

    public static void main(String[] args) {
        CorporateCar cc1 = new CorporateCar() {
        };

        ArrayList<Vehicles> vList = new ArrayList<>();

        vList.add(cc1);

        ArrayList<Asset> aList = new ArrayList<>();

        aList.add(cc1);

        ArrayList<Object> oList = new ArrayList<>();

        oList.add(cc1);

        vList.get(0).accerelate();
        vList.get(0).brake();
        aList.get(0).getPurchasedPrice();
        oList.get(0).toString();

    }
}
