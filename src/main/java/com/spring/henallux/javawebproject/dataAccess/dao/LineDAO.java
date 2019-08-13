package com.spring.henallux.javawebproject.dataAccess.dao;

import com.spring.henallux.javawebproject.dataAccess.repository.LineRepository;
import com.spring.henallux.javawebproject.model.Line;
import com.spring.henallux.javawebproject.utility.ProviderConverter;
import com.spring.henallux.javawebproject.utility.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class LineDAO {
    private final LineRepository dataAccess;
    private final ProviderConverter mapper;
    private final TestModel<Line> testLine;

    @Autowired
    public LineDAO(LineRepository dataAccess, ProviderConverter mapper, TestModel<Line> testLine) {
        this.dataAccess = dataAccess;
        this.mapper = mapper;
        this.testLine = testLine;
    }

    public Collection<Line> findLines(int commandId) {
        return dataAccess.findByCommandId(commandId).stream().map(mapper::lineEntityToLineModel).collect(Collectors.toList());
    }

    public Line saveLine(Line line) throws Exception {
        testLine.setObjectToTest(line);
        if (testLine.hasError()) throw new Exception(); //TODO better exception

        dataAccess.save(mapper.lineModelToLineEntity(line));
        return line;
    }

    public Line deleteLine(Line line) {
        dataAccess.delete(mapper.lineModelToLineEntity(line));
        return line;
    }
}
