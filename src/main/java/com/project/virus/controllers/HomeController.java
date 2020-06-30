// Author: John Matzakos | Date: 21/05/2020

package com.project.virus.controllers;

import com.project.virus.models.TotalCases;
import com.project.virus.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/")
    public String index(Model model){

        List<TotalCases> totalDataList = homeService.getTotalDataList();

        model.addAttribute("totalDataList", totalDataList);

        return "index";
    }



}
