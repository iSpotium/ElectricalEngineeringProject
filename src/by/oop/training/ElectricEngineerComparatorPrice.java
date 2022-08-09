package by.oop.training;

import java.util.Comparator;

public class ElectricEngineerComparatorPrice implements Comparator<ElectricalEngineering> {
    public int compare(ElectricalEngineering o1, ElectricalEngineering o2) {
        int price1 = o1.getPrice();
        int price2 = o2.getPrice();
        if (price1 < price2) {
            return -1;
        } else if (price1 == price2) {
            return 0;
        } else {
            return 1;
        }
    }

    static class ElectricEngineerComparatorYear implements Comparator<ElectricalEngineering> {
        public int compare(ElectricalEngineering o1, ElectricalEngineering o2) {
            int year1 = o1.getReleaseYear();
            int year2 = o2.getReleaseYear();
            if (year1 < year2) {
                return -1;
            } else if (year1 == year2) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
