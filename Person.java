/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vojta
 */
public class Person {
    private String name;
    private String address;
    
    public Person(String name, String adress){
        this.name = name;
        this.address = adress;
    }
    
    public Person(String name, String adress, int credit){
        this.name = name;
        this.address = adress;
        
    }
    
    public String toString(){       
        return this.name + "\n  " + this.address;
    }
}
