/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2D3HM;

/**
 *
 * @author Gude
 */
public interface Asset {

    double getPurchasedPrice();

    double getCurrentValue();

    double amoritize(int years);
}
