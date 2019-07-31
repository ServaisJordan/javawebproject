package com.spring.henallux.javawebproject.dataAccess.dao;

import com.spring.henallux.javawebproject.dataAccess.entity.CommandEntity;
import com.spring.henallux.javawebproject.dataAccess.repository.CommandRepository;
import com.spring.henallux.javawebproject.model.Command;
import com.spring.henallux.javawebproject.utility.ProviderConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CommandDAO {
    private final CommandRepository dataAccess;
    private final ProviderConverter mapper;

    @Autowired
    public CommandDAO(CommandRepository dataAccess, ProviderConverter mapper) {
        this.dataAccess = dataAccess;
        this.mapper = mapper;
    }

    public Command findCommand(int id) throws Exception {
        Optional<CommandEntity> command = dataAccess.findById(String.valueOf(id));

        if (!command.isPresent()) throw new Exception();
        return mapper.commandEntityToCommandModel(command.get());
    }

    public Collection<Command> findCommands(String username) {
        return dataAccess.findByCustomerUsername(username).stream().map(mapper::commandEntityToCommandModel).collect(Collectors.toList());
    }

    public Command saveCommand(Command command) {
        dataAccess.save(mapper.commandModelToCommandEntity(command));
        return command;
    }

    public Command deleteCommand(Command command) {
        dataAccess.delete(mapper.commandModelToCommandEntity(command));
        return command;
    }
}
