/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2D3HM;

/**
 * @author Gude
 */
public abstract class CorporateCar extends Vehicles implements Asset {

    private double purchasePrice;
    private double currentValue;
    private int yearPurchased;
    private static int yearsSincePurchased = 1;
    private String employee;

    CorporateCar() {

    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Override
    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public int getYearPurchased() {
        return yearPurchased;
    }

    public void setYearPurchased(int yearPurchased) {
        this.yearPurchased = yearPurchased;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    @Override
    public void accerelate() {
        if (speed + 5 <= 65) {
            speed += 5;
        }
    }

    @Override
    public void brake() {
        if (speed - 5 >= 0) {
            speed -= 5;
        }
    }

    @Override
    public double getPurchasedPrice() {
        return purchasePrice;
    }

    @Override
    public double amoritize(int years) {
        if (currentValue < purchasePrice) {
            return currentValue;
        } else {
            if (yearsSincePurchased <= years) {
                currentValue = purchasePrice - (purchasePrice / years) * yearsSincePurchased;
                yearsSincePurchased++;
            }
            return currentValue;
        }
    }

}
