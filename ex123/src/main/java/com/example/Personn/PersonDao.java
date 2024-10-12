package com.example.Personn;

import java.util.ArrayList;
import java.util.List;

public class PersonDao {

    private List<Person> persons = new ArrayList<>(); 


    public void save(Person p) {
        persons.add(p);
    
    }

    public List<String> isValid(Person p) {
        List<String> errors = new ArrayList<>();

        if (p.getName().split(" ").length < 2 || !p.getName().matches("[a-zA-Z ]+")) {
            errors.add("O nome deve conter pelo menos 2 partes e ser composto apenas por letras.");
        }

        if (p.getAge() < 1 || p.getAge() > 200) {
            errors.add("A idade deve estar no intervalo [1, 200].");
        }

        if (p.getEmails().isEmpty()) {
            errors.add("A pessoa deve ter pelo menos um email associado.");
        } else {
            for (Email email : p.getEmails()) {
                if (!email.getName().matches("^[^@]+@[^@]+\\.[^@]+$")) {
                    errors.add("O email " + email.getName() + " não está no formato válido '_____@____.___'.");
                }
            }
        }

        return errors;
    }

    public List<Person> savePerson() {
        return persons; 
    }
    
    
}
