package by.tsikunov.task1.model.service.dao;

import by.tsikunov.task1.model.service.dao.impl.ApplianceDaoImpl;

public class DaoFactory {
    private static final DaoFactory instance = new DaoFactory();
    private final ApplianceDAO applianceDAO;

    private DaoFactory() {
        applianceDAO = new ApplianceDaoImpl();
    }

    public static DaoFactory getInstance() {
        return instance;
    }

    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }
}
