// Author: John Matzakos | Date: 21/05/2020

package com.project.virus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VirusController {

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

}
