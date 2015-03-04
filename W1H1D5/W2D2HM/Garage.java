/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2D2HM;
import java.util.ArrayList;
/**
 *
 * @author Gude
 */
public class Garage {
   // private AutoMobile a;
   // private ArrayList<Item> Items = new ArrayList<>();
   // public void store(AutoMible a){
   //     this.a =a ;
  //  }
    
    private AutoMobile a;
    private ArrayList<Item> items = new ArrayList<>();
    Garage() {
        this.a = new AutoMobile();
    }
    public void store(AutoMobile a) {
        this.a=a;
    }    
    public void store(Item a) {
        items.add(a);
    }
    
    public AutoMobile retrieve() {
        return this.a;
    }
    
    public Item retrieve(int index) {
        return items.get(index);
    }
}
   