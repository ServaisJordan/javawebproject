package com.spring.henallux.javawebproject.dataAccess.dao;

import com.spring.henallux.javawebproject.dataAccess.repository.LineRepository;
import com.spring.henallux.javawebproject.model.Line;
import com.spring.henallux.javawebproject.utility.ProviderConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class LineDAO {
    private final LineRepository dataAccess;
    private final ProviderConverter mapper;

    @Autowired
    public LineDAO(LineRepository dataAccess, ProviderConverter mapper) {
        this.dataAccess = dataAccess;
        this.mapper = mapper;
    }

    public Collection<Line> findLine(int commandId) {
        return dataAccess.findByCommandId(commandId).stream().map(mapper::lineEntityToLineModel).collect(Collectors.toList());
    }

    public Line saveLine(Line line) {
        dataAccess.save(mapper.lineModelToLineEntity(line));
        return line;
    }

    public Line deleteLine(Line line) {
        dataAccess.delete(mapper.lineModelToLineEntity(line));
        return line;
    }
}
