package by.oop.training;

import java.util.Objects;

public class Oven extends ElectricalEngineering {
    private int powerConsumtion;
    private int weight;
    private int capasity;
    private int depth;
    private double height;
    private double width;

    public Oven() {
        powerConsumtion = 0;
        weight = 0;
        capasity = 0;
        depth = 0;
        height = 0;
        width = 0;
    }

    public Oven(String name, int energyСonsumption, int price, int releaseYear, int powerConsumtion, int weight, int capasity, int depth, double height, double width) {
        super(name, energyСonsumption, price, releaseYear);
        this.powerConsumtion = powerConsumtion;
        this.weight = weight;
        this.capasity = capasity;
        this.depth = depth;
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

    public int getCapasity() {
        return capasity;
    }

    public void setCapasity(int capasity) {
        this.capasity = capasity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
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
        if (!(o instanceof Oven)) return false;
        if (!super.equals(o)) return false;
        Oven oven = (Oven) o;
        return getPowerConsumtion() == oven.getPowerConsumtion() && getWeight() == oven.getWeight() && getCapasity() == oven.getCapasity() && getDepth() == oven.getDepth() && Double.compare(oven.getHeight(), getHeight()) == 0 && Double.compare(oven.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPowerConsumtion(), getWeight(), getCapasity(), getDepth(), getHeight(), getWidth());
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumtion=" + powerConsumtion +
                ", weight=" + weight +
                ", capasity=" + capasity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

}