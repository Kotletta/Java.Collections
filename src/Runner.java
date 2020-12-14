import Model.MilitaryType;
import Planes.MilitaryPlane;
import Planes.Plane;
import Planes.TransportPlane;
import Planes.PassengersPlane;
import Model.PassengersType;
import Model.TransportType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 
public class Runner {
    private static List<Plane> planes = Arrays.asList(
            new MilitaryPlane("SU-34", 10, 5000, 10000, 150, MilitaryType.DISTROYER),
            new MilitaryPlane("B-3", 30, 14500, 6000, 330, MilitaryType.BOMBER),
            new MilitaryPlane("MIG-49", 10, 3500, 20000, 100, MilitaryType.TACTICAL),
            new PassengersPlane("Boeng-737", 900, 10000, 5000, 400, PassengersType.CIVIL),
            new PassengersPlane("Super Jet 100", 500, 2000, 7000, 165, PassengersType.CHARTER),
            new PassengersPlane("Boeng-777 MAIL RUS", 300, 13000, 15000, 450, PassengersType.POSTAL),
            new TransportPlane("Airbus A-333", 660, 20000, 6500, 480, TransportType.HEAVY),
            new TransportPlane("Airbus L-100 Lite", 200, 7600, 12500, 300, TransportType.MEDIUM),
            new TransportPlane("Lockheed C-130 Hercules", 70, 4500, 13450, 230, TransportType.SMALL)
    );

    public static void main(String[] args) {
        AirportByKotletta airportByKotletta = new AirportByKotletta(planes);
        System.out.println("Общая вместимость самолетов : " + airportByKotletta.getTotalCopacity() + " мест");
        System.out.println("Общая грузоподъемность самолетов :" + airportByKotletta.getTotalCarrying() + " килограмм");
        planes.sort(((o1, o2) -> o1.getMaxFlightDistance() - o2.getMaxFlightDistance()));
        System.out.println("Сортировка самолетов по дальности полета :" + planes);
        System.out.println("Сортировка по расходу топлива в диапазоне : " + airportByKotletta.getListSortByFuelCunsumption(140,410));

    }
}
