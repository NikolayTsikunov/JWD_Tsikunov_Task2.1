package by.tsikunov.task1.model.service;

import by.tsikunov.task1.model.service.dao.ApplianceDAO;
import by.tsikunov.task1.model.service.dao.DaoException;
import by.tsikunov.task1.model.service.dao.impl.ApplianceDaoImpl;
import by.tsikunov.task1.model.service.entity.option.Option;

import java.nio.file.Path;
import java.nio.file.Paths;

public class maintest {
    public static void main(String[] args) throws DaoException {
        ApplianceDaoImpl app = new ApplianceDaoImpl();
        Option op = new Option("Laptop");
        op.addOption("MEMORY_ROM", "8000");
        op.addOption("BATTERY_CAPACITY", "1.5");
        app.find(op);
    }
}
