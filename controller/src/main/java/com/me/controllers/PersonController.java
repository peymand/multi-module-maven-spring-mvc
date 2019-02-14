package com.me.controllers;

import com.me.entities.Person;
import com.me.serviceContracts.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/* com.me.controllers
@Author:Peyman
Date: 14/02/2019
Time: 10:03 AM
Year: 2019
*/
@Controller
@RequestMapping("/")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public String goHome(Model model){
        Person p = new Person();
        model.addAttribute("person",p);
        return "index";
    }
    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("person") Person person, BindingResult result){
        if(result!=null){
            return "index";
        }
        System.out.println(person);
        personService.save(person);
        return "done";
    }
}
