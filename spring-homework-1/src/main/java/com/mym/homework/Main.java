package com.mym.homework;

import com.mym.homework.service.InterviewProcess;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var context = new ClassPathXmlApplicationContext("/spring-context.xml");
        var interviewProcess = context.getBean(InterviewProcess.class);
        interviewProcess.parseQuestions(interviewProcess.getFileName(), interviewProcess.getDelimiter());
    }
}