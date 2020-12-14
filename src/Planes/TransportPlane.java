package Planes;

import Model.TransportType;

public class TransportPlane extends Plane {

    private TransportType transportType;

    public TransportPlane (String model, int capacity, int carrying, int maxFlightDistance, int fuelConsumption, TransportType transportType) {
        super(model, capacity, carrying, maxFlightDistance, fuelConsumption);
        this.transportType = transportType;

    }

    public TransportType getTransportType() {
        return transportType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", TransportType=" + transportType +
                '}');
    }
}
