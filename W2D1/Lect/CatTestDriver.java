/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2D1.Lect;

/**
 *
 * @author Gude
 */
public class CatTestDriver {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        
        cat1.setName("Mimi");
        cat2.setName("Mittens");
        
        System.out.println(cat1.getName() + " says meow");
        System.out.println(cat2.getName() + " says HI");

    }
    
}
