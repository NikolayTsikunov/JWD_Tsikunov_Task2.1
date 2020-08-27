package by.tsikunov.task1.model.service.entity.impl;

import by.tsikunov.task1.model.service.entity.Appliance;

import java.util.StringJoiner;

public class Laptop implements Appliance {
    private double batteryCapacity;
    private String os;
    private int memROM;
    private int sysMem;
    private double cpu;
    private int displayInches;

    public Laptop(double batteryCapacity, String os, int memROM,
                  int sysMem, double cpu, int displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memROM = memROM;
        this.sysMem = sysMem;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 &&
                memROM == laptop.memROM &&
                sysMem == laptop.sysMem &&
                Double.compare(laptop.cpu, cpu) == 0 &&
                displayInches == laptop.displayInches &&
                os.equals(laptop.os);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (int)batteryCapacity;
        result = 31 * result + os != null ? os.hashCode() : 0;
        result = 31 * result + memROM;
        result = 31 * result + sysMem;
        result = 31 * result + (int)cpu;
        result = 31 * result + displayInches;
        return result;
    }

    @Override
    public String toString() {
        StringJoiner str = new StringJoiner(", ", Laptop.class.getSimpleName() + "[", "]")
                .add("battery_capacity=" + batteryCapacity)
                .add("OS=" + os)
                .add("memory_ROM=" + memROM)
                .add("system_memory=" + sysMem)
                .add("CPU=" + cpu)
                .add("display_inches=" + displayInches);
        return str.toString();
    }
}
