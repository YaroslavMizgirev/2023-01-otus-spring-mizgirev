package com.mym.spring;

import com.mym.spring.domain.Person;
import com.mym.spring.service.PersonService;
import com.mym.spring.service.PersonServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  
  private static final Logger LOGGER = LogManager.getLogger(Main.class);
  
  public static void main(String[] args) {

    try (ClassPathXmlApplicationContext context =
                 new ClassPathXmlApplicationContext("/spring-context.xml")) {
      PersonService service = context.getBean(PersonServiceImpl.class);
      Person ivan = service.getByName("Ivan");
      LOGGER.log(Level.INFO, ivan.toString());
    } catch (BeansException e) {
      e.printStackTrace();
    }

  }
}
