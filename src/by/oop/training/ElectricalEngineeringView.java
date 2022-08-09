package by.oop.training;

import java.util.List;

public class ElectricalEngineeringView {
    public void printListElectricalNamePriceYearConsumption(List<ElectricalEngineering> electrics){
        for(ElectricalEngineering i : electrics){
            System.out.println("Device :" + i.getName() + ", Price in dollars: " + i.getPrice() + ", Energy consumption: " + i.getEnergyСonsumption() + ", Year release: " + i.getReleaseYear());
        }
    }
    public void printSpeakersList (List<Speakers> list){
        for(Speakers i : list){
            System.out.println("Device :" + i.getName() + ", Price in dollars: " + i.getPrice() + ", Energy consumption: " + i.getEnergyСonsumption() + ", Year release: " + i.getReleaseYear());
        }
    }
}
