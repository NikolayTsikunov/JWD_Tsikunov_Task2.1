package by.tsikunov.task1.model.service.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {
    private String searchingAppliance;
    private Map<String, String> criteria;

    public Criteria(String searchingAppliance) {
        this.searchingAppliance = searchingAppliance;
        criteria = new HashMap<>();
    }

    public String getSearchingAppliance() {
        return searchingAppliance;
    }

    public Map<String, String> getSearchingParameter() {
        return criteria;
    }

    public void add(String parameter, String value) {
        criteria.put(parameter, value);
    }

}
