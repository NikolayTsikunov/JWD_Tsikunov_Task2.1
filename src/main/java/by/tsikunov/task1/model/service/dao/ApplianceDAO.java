package by.tsikunov.task1.model.service.dao;

import by.tsikunov.task1.model.service.entity.Appliance;
import by.tsikunov.task1.model.service.entity.option.Option;

import java.util.List;

public interface ApplianceDAO {
    List<Appliance> find (Option option) throws DaoException;
}
