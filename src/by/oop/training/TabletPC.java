package by.oop.training;

import java.util.Objects;

public class TabletPC extends ElectricalEngineering {
    private int batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;

    public TabletPC(){
        batteryCapacity = 0;
        displayInches = 0;
        memoryRom = 0;
        flashMemoryCapacity = 0;
        color ="";
    }

    public TabletPC(String name, int energyСonsumption, int price, int releaseYear, int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity, String color) {
        super(name, energyСonsumption, price, releaseYear);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;
        if (!super.equals(o)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return getBatteryCapacity() == tabletPC.getBatteryCapacity() && getDisplayInches() == tabletPC.getDisplayInches() && getMemoryRom() == tabletPC.getMemoryRom() && getFlashMemoryCapacity() == tabletPC.getFlashMemoryCapacity() && Objects.equals(getColor(), tabletPC.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBatteryCapacity(), getDisplayInches(), getMemoryRom(), getFlashMemoryCapacity(), getColor());
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }

}
