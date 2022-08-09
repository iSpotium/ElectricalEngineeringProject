package by.oop.training;

import java.util.Objects;

public class VacuumCleaner extends ElectricalEngineering {
    private int powerConsumtion;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(){
        powerConsumtion = 0;
        filterType = "";
        bagType = "";
        wandType = "";
        motorSpeedRegulation = 0;
        cleaningWidth = 0;
    }

    public VacuumCleaner(String name, int energyСonsumption, int price, int releaseYear, int powerConsumtion, String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
        super(name, energyСonsumption, price, releaseYear);
        this.powerConsumtion = powerConsumtion;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public int getPowerConsumtion() {
        return powerConsumtion;
    }

    public void setPowerConsumtion(int powerConsumtion) {
        this.powerConsumtion = powerConsumtion;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return getPowerConsumtion() == that.getPowerConsumtion() && getMotorSpeedRegulation() == that.getMotorSpeedRegulation() && getCleaningWidth() == that.getCleaningWidth() && Objects.equals(getFilterType(), that.getFilterType()) && Objects.equals(getBagType(), that.getBagType()) && Objects.equals(getWandType(), that.getWandType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPowerConsumtion(), getFilterType(), getBagType(), getWandType(), getMotorSpeedRegulation(), getCleaningWidth());
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumtion=" + powerConsumtion +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }

}
