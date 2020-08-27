package by.tsikunov.task1.model.service.entity.impl;

import by.tsikunov.task1.model.service.entity.Appliance;

import java.util.StringJoiner;

public class Oven implements Appliance {
    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public Oven(int powerConsumption, int weight, int capacity,
                int depth, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(this == null || getClass() != o.getClass()) {
            return false;
        }
        Oven oven = (Oven) o;
        return powerConsumption == oven.powerConsumption &&
                weight == oven.weight &&
                capacity == oven.capacity &&
                depth == oven.depth &&
                Double.compare(height, oven.height) == 0 &&
                Double.compare(width, oven.width) == 0;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + powerConsumption;
        result = 31 * result + weight;
        result = 31 * result + capacity;
        result = 31 * result + depth;
        result = 31 * result + (int)height;
        result = 31 * result + (int)width;
        return result;
    }

    @Override
    public String toString() {
        StringJoiner str = new StringJoiner(", ", Oven.class.getSimpleName() + "[", "]")
                .add("powerConsumption=" + powerConsumption)
                .add("weight=" + weight)
                .add("capacity=" + capacity)
                .add("depth=" + depth)
                .add("height=" + height)
                .add("width=" + width);
        return str.toString();
    }
}
