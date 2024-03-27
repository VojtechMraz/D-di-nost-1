/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vojta
 */
public class Teacher extends Person{
    private int vyplata;
    
    public Teacher(String name, String adresa, int vyplata){
        super(name,adresa);
        this.vyplata = vyplata;
    }
    
    public String toString(){
        return super.toString() + "\n  salary " + this.vyplata + " euro/month";
    }
}
