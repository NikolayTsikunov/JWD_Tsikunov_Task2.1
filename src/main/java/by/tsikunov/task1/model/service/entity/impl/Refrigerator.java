package by.tsikunov.task1.model.service.entity.impl;

import by.tsikunov.task1.model.service.entity.Appliance;

import java.util.Objects;
import java.util.StringJoiner;

public class Refrigerator implements Appliance {
    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;

    public Refrigerator(int powerConsumption, int weight, int freezerCapacity,
                        double overallCapacity, int height, int width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return powerConsumption == that.powerConsumption &&
                weight == that.weight &&
                freezerCapacity == that.freezerCapacity &&
                Double.compare(that.overallCapacity, overallCapacity) == 0 &&
                height == that.height &&
                width == that.width;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + powerConsumption;
        result = 31 * result + weight;
        result = 31 * result + (int)overallCapacity;
        result = 31 * result + freezerCapacity;
        result = 31 * result + height;
        result = 31 * result + width;
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Refrigerator.class.getSimpleName() + "[", "]")
                .add("powerConsumption=" + powerConsumption)
                .add("weight=" + weight)
                .add("freezerCapacity=" + freezerCapacity)
                .add("overallCapacity=" + overallCapacity)
                .add("height=" + height)
                .add("width=" + width)
                .toString();
    }
}
