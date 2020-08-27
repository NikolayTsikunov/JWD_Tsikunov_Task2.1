package by.tsikunov.task1.model.service.entity.impl;

import by.tsikunov.task1.model.service.entity.Appliance;

import java.util.Objects;
import java.util.StringJoiner;

public class VacuumCleaner implements Appliance {
    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeed;
    private int cleaningWidth;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return powerConsumption == that.powerConsumption &&
                motorSpeed == that.motorSpeed &&
                cleaningWidth == that.cleaningWidth &&
                filterType.equals(that.filterType) &&
                bagType.equals(that.bagType) &&
                wandType.equals(that.wandType);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + powerConsumption;
        result = 31 * result + motorSpeed;
        result = 31 * result + cleaningWidth;
        result = 31 * result + filterType != null ? filterType.hashCode() : 0;
        result = 31 * result + bagType != null ? bagType.hashCode() : 0;
        result = 31 * result + wandType != null ? wandType.hashCode() : 0;
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", VacuumCleaner.class.getSimpleName() + "[", "]")
                .add("powerConsumption=" + powerConsumption)
                .add("filterType=" + filterType)
                .add("bagType=" + bagType)
                .add("wandType=" + wandType)
                .add("motorSpeed=" + motorSpeed)
                .add("cleaningWidth=" + cleaningWidth)
                .toString();
    }
}
