package by.oop.training;

import java.util.Objects;

public class Speakers extends ElectricalEngineering {
    private int powerConsumption;
    private int numberOfSpeakers;
    private double frequencyRangeFrom;
    private double frequencyRangeTo;
    private int cordLength;

    public Speakers(){
        powerConsumption = 0;
        numberOfSpeakers = 0;
        frequencyRangeFrom = 0;
        frequencyRangeTo = 0;
        cordLength = 0;
    }

    public Speakers(String name, int energyСonsumption, int price, int releaseYear, int powerConsumtion, int numberOfSpeakers, double frequencyRangeFrom, double frequencyRangeTo, int cordLength) {
        super(name, energyСonsumption, price, releaseYear);
        this.powerConsumption = powerConsumtion;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRangeFrom = frequencyRangeFrom;
        this.frequencyRangeTo = frequencyRangeTo;
        this.cordLength = cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double getFrequencyRangeFrom() {
        return frequencyRangeFrom;
    }

    public void setFrequencyRangeFrom(double frequencyRangeFrom) {
        this.frequencyRangeFrom = frequencyRangeFrom;
    }

    public double getFrequencyRangeTo() {
        return frequencyRangeTo;
    }

    public void setFrequencyRangeTo(double frequencyRangeTo) {
        this.frequencyRangeTo = frequencyRangeTo;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;
        if (!super.equals(o)) return false;
        Speakers speakers = (Speakers) o;
        return getPowerConsumption() == speakers.getPowerConsumption() && getNumberOfSpeakers() == speakers.getNumberOfSpeakers() && Double.compare(speakers.getFrequencyRangeFrom(), getFrequencyRangeFrom()) == 0 && Double.compare(speakers.getFrequencyRangeTo(), getFrequencyRangeTo()) == 0 && getCordLength() == speakers.getCordLength();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPowerConsumption(), getNumberOfSpeakers(), getFrequencyRangeFrom(), getFrequencyRangeTo(), getCordLength());
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumtion=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRangeFrom=" + frequencyRangeFrom +
                ", frequencyRangeTo=" + frequencyRangeTo +
                ", cordLength=" + cordLength +
                '}';
    }

}
