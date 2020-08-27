package by.tsikunov.task1.model.service.dao.creator;

import by.tsikunov.task1.model.service.dao.creator.command.Command;

public class ApplianceCreator {
    private ApplianceCreator() { }

    public static Command defineCreator(String applianceType) {
        CreatorType type = CreatorType.valueOf(applianceType.toUpperCase());
        return type.getCommand();
    }
}
