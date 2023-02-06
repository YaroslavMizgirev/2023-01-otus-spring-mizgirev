package com.mym.homework.service;

import com.mym.homework.dao.InterviewParser;
import com.mym.homework.domain.Interview;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Collection;

@AllArgsConstructor
@Setter
@Getter
public class InterviewProcess {
    private final static Logger LOGGER = LogManager.getLogger(InterviewParser.class);
    private String fileName;
    private String delimiter;
    private InterviewParser interviewParser;

    public Collection<Interview> parseQuestions(String fileName, String delimiter) throws IOException {
        return interviewParser.getAllQuestions(fileName, delimiter);
    }
}
