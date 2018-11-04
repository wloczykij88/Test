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
        Animal animal1 = new Bird(12,"M",23);
        animal1.eat();
        animal1.move();
        
        Animal chick1 = new Fish(1,"M",2);
        chick1.move();
     
       moveAnimal(animal1);
       moveAnimal(chick1);
       
       Flyable fly = new Sparrow(12,"w",3);
    }  
        public static void moveAnimal(Animal animal){
            animal.move();
        }
    
}
