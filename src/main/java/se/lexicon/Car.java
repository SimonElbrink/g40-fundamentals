package se.lexicon;

public class Car {

    String brand;
    String color;
    double weightInTons;
    String ownerName;
    int doors;

    public String getInformation(){
        return "The Car is of model " + brand + " and the weight is " + weightInTons + " Tons";
    }

}
