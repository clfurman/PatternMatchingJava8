/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.crystalfurman.patternmatching;

import java.util.ArrayList;

/**
 *
 * @author Crystal Furman
 */
public class AnimalJava8 {

    public static void main(String[] args) {
        Dog d = new Dog(new LicenseName("Brady the Blue Brindle", "Brady"), "Whippet", 46.7);
        Cat c = new Cat("Sweetie", "Siamese", 7.5);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(d);
        animals.add(c);

        for (Animal a : animals) {
            if (a instanceof Dog) {
                Dog dog = (Dog) a;
                LicenseName name = dog.getName();
                System.out.println(name.getnickname());
            } else if (a instanceof Cat) {
                Cat cat = (Cat) a;
                System.out.println(cat.getName());
            }

        }

    }
}
