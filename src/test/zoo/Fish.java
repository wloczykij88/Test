/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.zoo;

import test.*;

/**
 *
 * @author Yossarian
 */
public class Fish extends Animal {

    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }
    
    
    
    public void swim(){
        System.out.println("swim...");
    }
    
    @Override
    public void move(){
        System.out.println("Swimming");
    }
}
