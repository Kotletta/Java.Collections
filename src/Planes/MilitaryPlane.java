package Planes;

import Model.MilitaryType;

public class MilitaryPlane extends Plane {

    private MilitaryType militaryType;

    public MilitaryPlane (String model, int capacity, int carrying, int maxFlightDistance, int fuelConsumption, MilitaryType militaryType) {
        super (model, capacity, carrying, maxFlightDistance, fuelConsumption);
        this.militaryType = militaryType;
    }

    public MilitaryType getMilitaryType() {
        return militaryType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", MilitaryType=" + militaryType +
                '}');
    }
}
