package com.mym;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
  
  private static final Logger LOGGER = LogManager.getLogger(Starter.class);
  
  public static void main(String[] args) {
    
    LOGGER.log(Level.INFO, "Hello!");
    
  }
}
