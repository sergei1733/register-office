package edu.javacourse.register.dao;

import edu.javacourse.register.domain.Person;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PersonDaoTest {

    @Test
    public void findPerson() {
        PersonDao dao = new PersonDao();
        List<Person> person = dao.findPerson();

        person.forEach(p ->{
            System.out.println(p.getFirstname());
            System.out.println(p.getClass().getName());
            System.out.println(p.getPassports().size());
        });
    }
}