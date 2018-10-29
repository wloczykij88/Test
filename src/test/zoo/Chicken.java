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
public class Chicken extends Bird{

    public Chicken(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }
    
    //overriding the method defined in Bird
    public void fly(){
        System.out.println("not able to fly...");
    }
    
}
