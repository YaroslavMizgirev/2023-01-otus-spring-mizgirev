package com.mym.homework.service;

import com.mym.homework.dao.InterviewParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Start testing class InterviewProcess")
class InterviewProcessTest {

    @DisplayName("Should have correct constructor")
    @Test
    void shouldHaveCorrectConstructor() throws IOException {
        var interviewProcess = new InterviewProcess("/questions.csv", ",", new InterviewParser());
        assertEquals("/questions.csv", interviewProcess.getFileName());
        assertEquals(",", interviewProcess.getDelimiter());
        var interviewList = interviewProcess.parseQuestions(interviewProcess.getFileName(), interviewProcess.getDelimiter());
        assertEquals(5, interviewList.size());
    }
}
