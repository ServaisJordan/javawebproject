package com.spring.henallux.javawebproject.services;

import com.spring.henallux.javawebproject.dataAccess.dao.LineDAO;
import com.spring.henallux.javawebproject.model.Line;
import com.spring.henallux.javawebproject.utility.TestModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class LineServices {
    private final LineDAO dao;
    private final TestModel<Line> testLine;

    @Autowired
    public LineServices(LineDAO dao, TestModel testLine) {
        this.dao = dao;
        this.testLine = testLine;
    }

    public Collection<Line> findLines(int commandId) {
        return dao.findLines(commandId);
    }

    public Line saveLine(Line line) throws Exception {
        testLine.setObjectToTest(line);
        if (testLine.hasError()) throw new Exception(); //TODO better exception

        return dao.saveLine(line);
    }

    public Line delsteLine(Line line) {
        return dao.deleteLine(line);
    }
}
