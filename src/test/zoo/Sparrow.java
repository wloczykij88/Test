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
public class Sparrow extends Bird implements Flyable{

    public Sparrow(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }
    
    @Override
    public void fly(){
        System.out.println("flying...");
    }
    
}
