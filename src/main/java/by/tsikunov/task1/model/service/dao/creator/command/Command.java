package by.tsikunov.task1.model.service.dao.creator.command;

import by.tsikunov.task1.model.service.entity.Appliance;

import java.util.List;

public interface Command {
    Appliance execute(List<String> parameters);
}
