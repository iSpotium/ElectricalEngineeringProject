package by.oop.training;

import java.util.Objects;

public class Refrigerator extends ElectricalEngineering{
    private int powerConsumtion;
    private int weight;
    private int freezerCapacity;
    private double overallCapacity;
    private int height;
    private double width;

    public Refrigerator(){
        powerConsumtion = 0;
        weight = 0;
        freezerCapacity = 0;
        overallCapacity = 0;
        height = 0;
        width = 0;
    }

    public Refrigerator(String name, int energyСonsumption, int price, int releaseYear, int powerConsumtion, int weight, int freezerCapacity, double overallCapacity, int height, double width) {
        super(name, energyСonsumption, price, releaseYear);
        this.powerConsumtion = powerConsumtion;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public int getPowerConsumtion() {
        return powerConsumtion;
    }

    public void setPowerConsumtion(int powerConsumtion) {
        this.powerConsumtion = powerConsumtion;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerator)) return false;
        if (!super.equals(o)) return false;
        Refrigerator that = (Refrigerator) o;
        return getPowerConsumtion() == that.getPowerConsumtion() && getWeight() == that.getWeight() && getFreezerCapacity() == that.getFreezerCapacity() && Double.compare(that.getOverallCapacity(), getOverallCapacity()) == 0 && getHeight() == that.getHeight() && Double.compare(that.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPowerConsumtion(), getWeight(), getFreezerCapacity(), getOverallCapacity(), getHeight(), getWidth());
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumtion=" + powerConsumtion +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

}
