
package it.develhope.abstraction;
/**
 * A Boat class is a practical extension of the Vehicle abstraction
 */
public class Boat extends Vehicle {
    public double maxKnotsSpeed;
    public int boatKilosWeight;

    /**
     * Constructor method for Boat
     * @param maxSpeed double representing the maximum Boat speed in knots
     * @param weight an int for the total weight in kilos
     */

// it's not really necessary because numberOfWheels is initialised by default at 0

    public Boat (double maxSpeed, int weight){
        type = "Barca a vela";
        boatKilosWeight = weight;
        maxKnotsSpeed = maxSpeed;

    }

    // mandatory override of the abstract method doVehicleSound()
    @Override
    public void doVehicleSound() {
        System.out.println("The boat sound is Sccccch(idk)");
    }

    /**
     * Method that returns the boat details.
     * @return a String indicating the total kilos weight and the maximum knots speed
     */
    public String getBoatWeightAndSpeed(){
        return ("The total kilos weight are " + boatKilosWeight + " and the maximum knots speed is " + maxKnotsSpeed);
    }
}








