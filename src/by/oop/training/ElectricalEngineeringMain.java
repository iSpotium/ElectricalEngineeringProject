package by.oop.training;

import java.util.*;

public class ElectricalEngineeringMain {
    public static void main(String[] args) {

        Comparator<ElectricalEngineering> comparator = new ElectricEngineerComparatorPrice();
        Comparator<ElectricalEngineering> comp = new ElectricEngineerComparatorPrice.ElectricEngineerComparatorYear();
        ElectricalEngineeringView view = new ElectricalEngineeringView();
        List<ElectricalEngineering> allElectricList = new ArrayList<>();
        List<Oven> ovenList = new ArrayList<>();

        ovenList.add(new Oven("Oven1", 5, 90, 2009, 2000, 11, 33, 60, 40, 70));
        ovenList.add(new Oven("Oven2", 2, 120, 2015, 1500, 12, 33, 60, 45, 68.0));
        ovenList.add(new Oven("Oven3", 1, 150, 2016, 1000, 10, 32, 60, 45.5, 59.5));

        List<Laptop> laptoplist = new ArrayList<>();

        laptoplist.add(new Laptop("Laptop1", 3, 700, 2014, 1, "Windows", 4000, 1000, 1.2, 18));
        laptoplist.add(new Laptop("Laptop2", 2, 850, 2013, 1.5, "Linux", 8000, 1000, 2.2, 19));
        laptoplist.add(new Laptop("Laptop3", 2, 670, 2011, 3, "Windows", 8000, 1500, 3.2, 22));

        List<Refrigerator> refrigeratorsList = new ArrayList<>();

        refrigeratorsList.add(new Refrigerator("Refrigerator1", 4, 90, 2008, 100, 20, 10, 300, 200, 70));
        refrigeratorsList.add(new Refrigerator("Refrigerator2", 7, 100, 2012, 200, 30, 15, 300, 180, 80));
        refrigeratorsList.add(new Refrigerator("Refrigerator3", 5, 105, 2014, 15, 35, 20, 350.5, 250, 75));

        List<VacuumCleaner> vacuumCleanerList = new ArrayList<>();

        vacuumCleanerList.add(new VacuumCleaner("VacuumCleaner1", 4, 77, 2013, 100, "A", "A2", "All-in-one", 3000, 20));
        vacuumCleanerList.add(new VacuumCleaner("VacuumCleaner2", 3, 82, 2015, 110, "B", "AA-89", "All-in-one", 2900, 25));
        vacuumCleanerList.add(new VacuumCleaner("VacuumCleaner3", 6, 95, 2016, 90, "C", "XX00", "All-in-one", 2950, 30));

        List<TabletPC> tabletPCList = new ArrayList<>();

        tabletPCList.add(new TabletPC("TabletPC1", 12, 850, 2017, 3, 14, 8000, 2, "Blue"));
        tabletPCList.add(new TabletPC("TabletPC2", 15, 1200, 2019, 4, 15, 8000, 6, "Red"));
        tabletPCList.add(new TabletPC("TabletPC3", 14, 1120, 2018, 5, 16, 16000, 8, "Green"));

        List<Speakers> speakersList = new ArrayList<>();

        speakersList.add(new Speakers("Speakers1", 1, 22, 2020, 15, 2, 2, 4, 2));
        speakersList.add(new Speakers("Speakers2", 1, 15, 2018, 20, 3, 3, 4, 3));
        speakersList.add(new Speakers("Speakers3", 1, 18, 2019, 17, 4, 2, 3.5, 4));

        allElectricList.addAll(ovenList);
        allElectricList.addAll(laptoplist);
        allElectricList.addAll(refrigeratorsList);
        allElectricList.addAll(vacuumCleanerList);
        allElectricList.addAll(tabletPCList);
        allElectricList.addAll(speakersList);

        System.out.println("BEFORE SORT");
        view.printListElectricalNamePriceYearConsumption(allElectricList);
        System.out.println();

        Collections.sort(allElectricList, comparator);
        System.out.println("AFTER PRICE SORT");
        view.printListElectricalNamePriceYearConsumption(allElectricList);

        System.out.println();
        System.out.println("AFTER RELEASE YEAR SORT");
        Collections.sort(allElectricList, comp);
        view.printListElectricalNamePriceYearConsumption(allElectricList);
    }
}