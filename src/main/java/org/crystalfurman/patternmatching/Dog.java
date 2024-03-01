package org.crystalfurman.patternmatching;

public class Dog implements Animal {

    private final LicenseName name;
    private final String breed;
    private final double weight;

    public Dog(LicenseName n, String b, double w) {
        name = n;
        breed = b;
        weight = w;
    }

    public LicenseName getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }
}
