package com.emap.contro;

import com.emap.domain.Person;
import com.emap.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/person")
public class PersonContro {

    @Autowired
    private PersonService personService;
    @RequestMapping("/find")
    public String findPerson(Person person){
        Person personById = personService.getPersonById(1);
        System.err.println(personById);
        System.err.println("hhshs");
        return "";
    }

    @RequestMapping("/insert")
    public String addPerson(Person person){

        person = new Person();
        person.setPid( (int)Math.random()*1000);
        person.setName("zhuga2so");
        personService.insert(person);
        return "";
    }

    @RequestMapping("/update")
    public String updatePerson(Person person){
        person.setPid(1);
        person.setName("朱高");
        personService.updateByPrimaryKey(person);
        return "";
    }

    @RequestMapping("/delete")
    public String deletePerson(){
        personService.deleteByPrimaryKey(2);
        return "";
    }
}
