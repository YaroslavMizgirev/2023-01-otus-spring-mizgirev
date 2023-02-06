package com.mym.homework.dao;

import java.io.IOException;
import java.util.Collection;

public interface Dao<T> {
    Collection<T> getAllQuestions(String filename, String delimiter) throws IOException;
}
