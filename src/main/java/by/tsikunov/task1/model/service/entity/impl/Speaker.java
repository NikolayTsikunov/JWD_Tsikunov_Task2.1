package by.tsikunov.task1.model.service.entity.impl;

import by.tsikunov.task1.model.service.entity.Appliance;

import java.util.Objects;
import java.util.StringJoiner;

public class Speaker implements Appliance {
    private int powerConsumption;
    private int numberSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speaker(int powerConsumption, int numberSpeakers, String frequencyRange, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberSpeakers = numberSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speaker speaker = (Speaker) o;
        return powerConsumption == speaker.powerConsumption &&
                numberSpeakers == speaker.numberSpeakers &&
                cordLength == speaker.cordLength &&
                frequencyRange.equals(speaker.frequencyRange);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + powerConsumption;
        result = 31 * result + numberSpeakers;
        result = 31 * result + cordLength;
        result = 31 * result + frequencyRange != null ? frequencyRange.hashCode() : 0;
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Speaker.class.getSimpleName() + "[", "]")
                .add("powerConsumption=" + powerConsumption)
                .add("numberSpeakers=" + numberSpeakers)
                .add("frequencyRange=" + frequencyRange)
                .add("cordLength=" + cordLength)
                .toString();
    }
}
