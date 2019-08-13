package com.spring.henallux.javawebproject.services;

import com.spring.henallux.javawebproject.dataAccess.dao.CommandDAO;
import com.spring.henallux.javawebproject.exceptions.CommandNotFound;
import com.spring.henallux.javawebproject.model.Command;
import com.spring.henallux.javawebproject.utility.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CommandServices {
    private final CommandDAO dao;
    private final TestModel<Command> commandTest;

    @Autowired
    public CommandServices(CommandDAO dao, TestModel<Command> commandTest) {
        this.dao = dao;
        this.commandTest = commandTest;
    }

    public Command findCommand(int id) throws CommandNotFound {
        return dao.findCommand(id);
    }

    public Collection<Command> findCommands(String username) {
        return dao.findCommands(username);
    }

    public Command saveCommand(Command command) throws Exception {
        commandTest.setObjectToTest(command);
        if (commandTest.hasError()) throw new Exception(); //TODO better exception

        return dao.saveCommand(command);
    }

    public Command deleteCommand(Command command) {
        return dao.deleteCommand(command);
    }
}
