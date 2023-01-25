package it.develhope.abstraction;
/**
 * A Car class is a practical extension of the Vehicle abstraction
 */
public class Car extends Vehicle {
    public int numberOfDoors;
    public double carPrice;

    // you can choose to override or not the showVehicleDetails() method - in this case there's the override
    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("The number of door of this car are " + numberOfDoors);
    }
    // you are forced to do this override because doVehicleSound() is an abstract method
    @Override
    public void doVehicleSound() {
        System.out.println("The car sound is broom broom");
    }
    /**
     * Car constructor
     * @param wheels an int representing the number of wheels
     * @param doors an int representing the number of doors
     * @param price a double representing the car's price
     */


    public Car (int wheels, int doors ,int price){
        numberOfDoors = doors;
        numberOfWheels = wheels;
        carPrice = price;
        type = "cabrio";

    }
}