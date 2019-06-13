/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author deferrari.exequiel
 */
public abstract class Persona {
    private String name;
    private String surname;
    private String age;

    public Persona(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    
    public abstract void profesion();
}
