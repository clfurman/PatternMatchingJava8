package org.crystalfurman.patternmatching;

public class Cat implements Animal {

    private final String name;
    private final String breed;
    private final double weight;

    public Cat(String n, String b, double w) {
        name = n;
        breed = b;
        weight = w;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

}
