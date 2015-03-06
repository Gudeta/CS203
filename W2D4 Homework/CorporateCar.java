/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2D4;

/**
 *
 * @author Gude
 */
public class CorporateCar extends Vehicle {

    private  double price;
    private double value;
    private int year=2015;
    private int yearsSincePurchased;
    private String employee=null;
    
     public CorporateCar(double x, double y, double direction, double price, 
             double value, int year,int yearsSincePurchased, String employee) {
        super(x, y, direction);
        this.price = price;
        this.value = value;
        this.year = year;
        this.yearsSincePurchased = yearsSincePurchased;
        this.employee = employee;
    }
     public CorporateCar(double price, double value, int year, String employee) {
        this.price = price;
        this.value = value;
        this.year = year;
        this.employee = employee;
    }
    public CorporateCar(double price, double value) {
        this.price = price;
        this.value = value;
    }
    
    
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public void accerelate() {
        if (speed + 5 <= 65) {
            speed += 5;
        }
    }

    public void brake() {
        if (speed - 5 >= 0) {
            speed -= 5;
        }
    }

    public double getPrice() {
        return price;
    }

    public double amoritize(int years) {
        if (value < price) {
            return value;
        } else {
            if (yearsSincePurchased <= years) {
                value = price - (price / years) * yearsSincePurchased;
                years++;
            }
            return value;
        }
    }

}
