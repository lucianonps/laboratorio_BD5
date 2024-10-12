package com.example.Personn;

import java.util.List;

public class ap {
    public static void main(String[] args) {

        PersonDao personDAO = new PersonDao();

        Person person1 = new Person(30, 1, "Luciano  pp");
        person1.addEmail(new Email(1, "joao.silva@example.com")); 

        Person person2 = new Person(20, 2, "Danilo pp");
        person2.addEmail(new Email(2,"Danilo.silva@pa.com"));


        save(personDAO, person1);
        save(personDAO, person2);



        System.out.println("Pessoas salvas:");
        for (Person p : personDAO.savePerson()) {
            System.out.println("ID: " + p.getId() + ", Nome: " + p.getName() + ", Idade: " + p.getAge());
            
            for (Email email : p.getEmails()) {
                System.out.println("Email: " + email.getName());
            }
        }
        

        
    }
    private static void save(PersonDao personDAO, Person person) {
        List<String> errors = personDAO.isValid(person);
        if (errors.isEmpty()) {
            personDAO.save(person);
            System.out.println("Pessoa " + person.getName() + " salvo com sucesso.");
        } else {
            System.out.println("Erros ao salvar " + person.getName() + ": " + errors);
        }
    }
    
}
