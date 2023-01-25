
package it.develhope.abstraction;

public class Start {

    public static void main(String[] args) {

        // create a Car object
        // listen to the Car sound
        // show the Vehicle details

        Car car = new Car(4, 3, 12000);
        car.showVehicleDetails();
        car.doVehicleSound();

        // create a Boat object
        // listen to the Boat sound
        // show the Vehicle details
        // print the Boat weight and speed

        Boat boat = new Boat(72.0,500);
        boat.showVehicleDetails();
        boat.doVehicleSound();

        System.out.println(boat.getBoatWeightAndSpeed());

    }
}







