package Planes;

abstract public class Plane {
    String model;
    private int capacity;
    private int carrying;
    private int maxFlightDistance;
    private int fuelConsumption;

    public Plane (String model, int capacity, int carrying, int maxFlightDistance, int fuelConsumption) {
        this.model = model;
        this.capacity = capacity;
        this.carrying = carrying;
        this.maxFlightDistance = maxFlightDistance;
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public void setMaxFlightDistance(int maxFlightDistance) {
        this.maxFlightDistance = maxFlightDistance;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", carrying=" + carrying +
                ", maxFlightDistance=" + maxFlightDistance +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plane plane = (Plane) o;

        if (capacity != plane.capacity) return false;
        if (carrying != plane.carrying) return false;
        if (maxFlightDistance != plane.maxFlightDistance) return false;
        if (fuelConsumption != plane.fuelConsumption) return false;
        return model != null ? model.equals(plane.model) : plane.model == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + capacity;
        result = 31 * result + carrying;
        result = 31 * result + maxFlightDistance;
        result = 31 * result + fuelConsumption;
        return result;
    }
}
