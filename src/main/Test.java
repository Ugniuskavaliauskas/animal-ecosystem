package main;

import animals.Rabbit;
import animals.Wolf;
import exceptions.*;
import interfaces.Liveable;
import organisms.Animal;

public class Test {
    public static void main(String[] args){
        System.out.println("Is viso gyvunu: " + Animal.getAnimalCount());
        System.out.println("Is viso gyvunu: " + Animal.getAnimalCount());
        Liveable triusis = new Rabbit();
        System.out.println(triusis.isAlive());
        Animal vilkas = new Wolf();
        vilkas.println();
        try{
            vilkas.move(101,0);
        }catch (InvalidMovementException e) {
            System.out.println(e.getMessage() + " " + e.getX() + " " + e.getY());
        }
        vilkas.println();



    }
}
