// Author: John Matzakos | Date: 21/05/2020

package com.project.virus.controllers;

import com.project.virus.models.Covid19Data;
import com.project.virus.services.VirusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class VirusController {

    @Autowired
    VirusService virusService;

    @GetMapping("/")
    public String index(Model model){

        List<Covid19Data> dataList = virusService.getDataList();

        System.out.println("dataList: "+dataList);

        for(Covid19Data i : dataList) {
            //model.addAttribute("country", i.getCountry());
            model.addAttribute("region", i.getRegion());
            model.addAttribute("county", i.getCounty());
            model.addAttribute("confirmedCases", i.getConfirmedCases());
            model.addAttribute("deaths", i.getDeaths());
            model.addAttribute("hospitalized", i.getHospitalized());
            model.addAttribute("criticalCases", i.getCriticalCases());
            model.addAttribute("recoveredCases", i.getRecoveredCases());
        }

        return "index";
    }



}
