import Planes.Plane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AirportByKotletta {
    private List<Plane> planes;

    public AirportByKotletta(List<Plane> planes) {
        this.planes = planes;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }
    public int getTotalCopacity() {
        int totalCopacity = 0;
        for (Plane plane : planes) {
            totalCopacity += plane.getCapacity();

        }
        return totalCopacity;
    }
    public int getTotalCarrying() {
        int totalCarrying = 0;
        for (Plane plane : planes) {
            totalCarrying += plane.getCarrying();

        }
        return totalCarrying;
    }


    
    List<Plane> getListSortByFuelCunsumption (int fuelMin, int fuelMax) {
        List<Plane> listSortByFuelCunsumption = new ArrayList<>();
        for (Plane c : planes) {
            if (c.getFuelConsumption() >= fuelMin && c.getFuelConsumption() <= fuelMax) {
                listSortByFuelCunsumption.add(c);
            }
        }
        return listSortByFuelCunsumption;
    }





}
