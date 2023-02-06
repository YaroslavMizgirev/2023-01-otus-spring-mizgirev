package com.mym.homework.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Start testing class Interview")
class InterviewTest {

    @DisplayName("Should have correct constructor")
    @Test
    void shouldHaveCorrectConstructor() {
        Interview interview = new Interview(1, "2+2= ?", 2, Arrays.asList("3","4","5"));
        assertEquals(1, interview.getId());
        assertEquals("2+2= ?", interview.getQuestion());
        assertEquals(2, interview.getRightAnswer());
        assertEquals(List.of("3", "4", "5"), interview.getAnswers());
    }
}
