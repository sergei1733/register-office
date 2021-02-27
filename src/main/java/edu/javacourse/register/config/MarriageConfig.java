package edu.javacourse.register.config;

import edu.javacourse.register.dao.PersonDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.plaf.PanelUI;
import java.sql.SQLOutput;

@Configuration
public class MarriageConfig {

    @Bean
    public PersonDao buildPersonDao(){
        System.out.println("Person dao is created");
        return new PersonDao();
    }
}