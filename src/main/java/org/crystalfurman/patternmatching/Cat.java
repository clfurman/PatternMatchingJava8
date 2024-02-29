package org.crystalfurman.patternmatching;

public class  Cat implements Animal
{
    
    private String name; 
    private String breed;   
    private double weight;

    public Cat (String n, String b, double w) 
    {
        name = n;
        breed = b;
        weight = w;
    }

    public String getName() { return name; }
    public String getBreed() { return breed; } 
    public double getWeight() { return weight; }

}