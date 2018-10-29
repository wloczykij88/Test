/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.zoo;

/**
 *
 * @author Yossarian
 */
public class Zoo {
    
    public static void main(String args[]){
        Animal animal1 = new Animal(12,"M",23);
        animal1.eat();
        
        Chicken chick1 = new Chicken(1,"M",2);
        chick1.fly();
    }
}
