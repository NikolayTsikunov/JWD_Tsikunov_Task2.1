package by.tsikunov.task1.model.service.dao.impl;

import by.tsikunov.task1.model.service.dao.ApplianceDAO;
import by.tsikunov.task1.model.service.dao.DaoException;
import by.tsikunov.task1.model.service.entity.Appliance;
import by.tsikunov.task1.model.service.entity.option.Option;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplianceDaoImpl implements ApplianceDAO {
    private static final String RESOURCE_NAME = "property.file";
    private static final String FILE_NAME = "filename";
    private static final String FILE_PATH = "path";

    @Override
    public List<Appliance> find(Option option) throws DaoException {
        Path path = getPath();
        List<String> items;
        try(Stream<String> stream = Files.lines(path)){
            List<Predicate<String>> filter = getFilter(option);
            items = stream.filter(filter.stream().reduce(x->true, Predicate::and))
                    .collect(Collectors.toList());
        } catch (IOException e){
            throw new DaoException("Error while reading file", e);
        }
        return createListAppliance(items);
    }

    private List<Predicate<String>> getFilter(Option option) {
        List<Predicate<String>> result = new ArrayList<>();
        result.add(str -> str.contains(option.getSearchingAppliance()));
        for (Map.Entry<String, String> entry :
                option.getSearchingOptions().entrySet()) {
            String filterParam = entry.toString();
            String parameter = filterParam.substring(1, filterParam.length() - 1);
            result.add(str -> str.contains(parameter));
        }
        return result;
    }

    private List<Appliance> createListAppliance(List<String> items) {
        List<Appliance> result = new ArrayList<>();
        // TODO: 27.08.2020  
        return result;
    }

    private Path getPath() throws DaoException {
        try {
            ResourceBundle res = ResourceBundle.getBundle(RESOURCE_NAME);
            String filePath = res.getString(FILE_PATH);
            String fileName = res.getString(FILE_NAME);
            System.out.println(filePath);
            System.out.println(fileName);
            Path path;
            if(Files.exists(Paths.get(filePath, fileName))) {
                path = Paths.get(filePath, fileName);
            } else {
                throw new DaoException("File does not exist");
            }
            return path;
        } catch (MissingResourceException e) {
            throw new DaoException("ResourceBundle does not exist", e);
        }
    }
}
