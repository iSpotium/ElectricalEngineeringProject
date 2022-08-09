package by.oop.training;

import java.util.Objects;

public abstract class ElectricalEngineering {
    private String name;
    private int energyConsumption;
    private int price;
    final private int releaseYear;

    ElectricalEngineering() {
        name = "";
        energyConsumption = 0;
        price = 0;
        releaseYear = 0;
    }

    ElectricalEngineering(String name, int energyСonsumption, int price, int releaseYear) {
        this.name = name;
        this.energyConsumption = energyСonsumption;
        this.price = price;
        this.releaseYear = releaseYear;
    }

    public int getEnergyСonsumption() {
        return energyConsumption;
    }

    public void setEnergyСonsumption(int energyСonsumption) {
        this.energyConsumption = energyСonsumption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectricalEngineering)) return false;
        ElectricalEngineering that = (ElectricalEngineering) o;
        return getEnergyСonsumption() == that.getEnergyСonsumption() && getPrice() == that.getPrice() && getReleaseYear() == that.getReleaseYear() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEnergyСonsumption(), getPrice(), getReleaseYear());
    }

}