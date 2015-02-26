/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W1D3;

/**
 *
 * @author Gude
 */
public class Dog {
    String name;
    public static void main(String[] args){
    
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bark";
        
        Dog dog2=new Dog();
        dog2.eat();
        dog2.name ="Mimi";
        
        Dog dog3 = new Dog();
        dog3.chaseCat();
        dog3.name = "Yoyoo";
        
        Dog[] myDogs =new Dog[3];
        
        myDogs[0] =new Dog();
        myDogs[1] =new Dog();
        myDogs[2] = dog1; 
        
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        
        System.out.print("last dod's name is ");
        System.out.println(myDogs[2].name);
        
        
        int x=0;
        while (x< myDogs.length){
            myDogs[x].bark();
            x= x+1;
        }
    }
    public void bark() {
        System.out.println(name + " Says Ruff!");
        
    }
    public void eat() {
        System.out.println(name +" say Mimi!");
        
    }
    public void chaseCat(){
        System.out.println(name + " says Yoyoo!");
    }
}
