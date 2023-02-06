package com.mym.homework.domain;

import lombok.Data;

import java.util.List;

@Data
public class Interview {
    private final int id;
    private final String question;
    private final int rightAnswer;
    private final List<String> answers;
}
