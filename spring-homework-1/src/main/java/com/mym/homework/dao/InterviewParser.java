package com.mym.homework.dao;

import com.mym.homework.domain.Interview;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.util.*;

public class InterviewParser implements Dao<Interview> {
    private final static Logger LOGGER = LogManager.getLogger(InterviewParser.class);
    @Override
    public Collection<Interview> getAllQuestions(String fileName, String delimiter) throws IOException {
        List<Interview> interviewList = new ArrayList<>();

        InputStream resource = new ClassPathResource(fileName, this.getClass().getClassLoader()).getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(resource));
        Scanner scanner = new Scanner(reader);

        final String[] title = scanner.nextLine().split(delimiter);
        LOGGER.log(Level.INFO, String.format("Parse title line: %s", Arrays.toString(title)));

        while (scanner.hasNext()) {
            final String[] value = scanner.nextLine().split(delimiter);
            LOGGER.log(Level.INFO, String.format("Parse data line: %s", Arrays.toString(value)));

            int id = 0;
            String question = "";
            int rightAnswer = 0;
            List<String> answers = new ArrayList<>();
            for (int index = 0; index < value.length; index++) {
                if (index == 0) {
                    id = Integer.parseInt(value[index]);
                } else if (index == 1) {
                    question = value[index];
                } else if (index == 2) {
                    rightAnswer = Integer.parseInt(value[index]);
                } else {
                    answers.add(value[index]);
                }
            }
            Interview interview = new Interview(id, question, rightAnswer, answers);
            LOGGER.log(Level.INFO, String.format("Parse new element of array to %s", interview));

            interviewList.add(interview);
        }
        reader.close();
        return interviewList;
    }
}
