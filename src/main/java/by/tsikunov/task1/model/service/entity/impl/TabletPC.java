package by.tsikunov.task1.model.service.entity.impl;

import by.tsikunov.task1.model.service.entity.Appliance;

import java.util.Objects;
import java.util.StringJoiner;

public class TabletPC implements Appliance {
    private int batteryCapacity;
    private int displayInches;
    private int memROM;
    private int flashMem;
    private String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0 &&
                displayInches == tabletPC.displayInches &&
                memROM == tabletPC.memROM &&
                flashMem == tabletPC.flashMem &&
                color.equals(tabletPC.color);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + batteryCapacity;
        result = 31 * result + displayInches;
        result = 31 * result + memROM;
        result = 31 * result + flashMem;
        result = 31 * result + color != null ? color.hashCode() : 0;
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TabletPC.class.getSimpleName() + "[", "]")
                .add("batteryCapacity=" + batteryCapacity)
                .add("displayInches=" + displayInches)
                .add("memROM=" + memROM)
                .add("flashMem=" + flashMem)
                .add("color=" + color)
                .toString();
    }
}
