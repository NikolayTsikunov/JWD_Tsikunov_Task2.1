package by.tsikunov.task1.model.service.entity.option;

import java.util.HashMap;
import java.util.Map;

public class Option {
    private String searchingAppliance;
    private Map<String, String> options;

    public Option(String searchingAppliance) {
        this.searchingAppliance = searchingAppliance;
        options = new HashMap<>();
    }

    public String getSearchingAppliance() {
        return searchingAppliance;
    }

    public Map<String, String> getSearchingOptions() {
        return options;
    }

    public void addOption(String parameter, String value) {
        options.put(parameter, value);
    }

}
