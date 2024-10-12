package com.example.Personn;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PersonDaoTest {

     private PersonDao personDao = new PersonDao();

    @ParameterizedTest
    @CsvSource({
        "'John Doe', 30, 'john.doe@example.com', true",
        "'Jane', 25, 'jane.doe@example.com', false",
        "'Invalid Email', 40, 'invalidemail', false",
        "'', 15, 'test@example.com', false",
        "'Valid Person', 100, '', false"
    })
    void testIsValid(String name, int age, String email, boolean isValid) {
        Person person = new Person(1, age, name);
        if (!email.isEmpty()) {
            person.addEmail(new Email(age, email));
        }
        
        List<String> errors = personDao.isValid(person);
        
        if (isValid) {
            assertTrue(errors.isEmpty(), "true " + errors);
        } else {
            assertFalse(errors.isEmpty(), "erro, false.");
        }
    }
    
}
