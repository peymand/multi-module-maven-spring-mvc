package com.me.controllers;

import java.security.Principal;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyContoller {

  @GetMapping("/home")
  public String index(Model model, Principal principal) {
    model.addAttribute("message", "You are logged in as " + principal.getName());
    String userName = null;
    if (principal instanceof UserDetails) {
//      userName = ((UserDetails)principal);
    } else {
      userName = principal.toString();
    }
    return "homepage";
  }

}
