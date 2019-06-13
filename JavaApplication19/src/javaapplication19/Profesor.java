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
public class Profesor extends Persona{

    public Profesor(String name, String surname, String age) {
        super(name, surname, age);
    }

    @Override
    public void profesion() {
        System.out.println("Soy profesor");
    }
    
}
