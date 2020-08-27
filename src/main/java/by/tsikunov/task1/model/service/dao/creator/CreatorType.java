package by.tsikunov.task1.model.service.dao.creator;

import by.tsikunov.task1.model.service.dao.creator.command.Command;
import by.tsikunov.task1.model.service.dao.creator.command.impl.*;

public enum CreatorType {
    OVEN(new CreateOvenCommand()),
    LAPTOP(new CreateLaptopCommand()),
    REFRIGERATOR(new CreateRefrigeratorCommand()),
    VACUUMCLEANER(new CreateVacuumCleanerCommand()),
    TABLETPC(new CreateTablePCCommand()),
    SPEAKERS(new CreateSpeakersCommand());

    private Command command;

    CreatorType(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}
