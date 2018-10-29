/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Objects;

/**
 *
 * @author Yossarian
 */
public class Human {
    String name;
    int age;
    int heightInches;
    String eyecolor;
    

    public Human(String name, int age, int heightInches, String eyecolor) {
        this.name = name;
        this.age = age;
        this.heightInches = heightInches;
        this.eyecolor = eyecolor;
    }
    
    
    
    public void speak(){
        System.out.println("Hello, my name is"+name);
        System.out.println("I'm, "+heightInches+" inchas tall");
        System.out.println("I am " + age + " years old");
        System.out.println("ete "+eyecolor);
        
    }
    
    public void eat(){
        System.out.println("eating...");
    }
    
    public void walk(){
        System.out.println("walking...");
                
    }
    
    public void work(){
        System.out.println("walking...");
    }
    
}
