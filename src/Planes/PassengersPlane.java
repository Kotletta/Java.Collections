package Planes;

import Model.PassengersType;

public class PassengersPlane extends Plane {

    private PassengersType passengersType;

    public PassengersPlane (String model, int capacity, int carrying, int maxFlightDistance, int fuelConsumption, PassengersType passengersType) {
        super (model, capacity, carrying, maxFlightDistance, fuelConsumption);
        this.passengersType = passengersType;
    }

    public PassengersType getPassengersType() {
        return passengersType;
    }

    @Override
    public String toString() {
        return super.toString().replace( "}",
                ", PassengersType=" + passengersType +
                '}');
    }
}
