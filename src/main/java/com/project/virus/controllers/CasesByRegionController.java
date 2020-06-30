// Author: John Matzakos | Date: 30/06/2020

package com.project.virus.controllers;

import com.project.virus.models.Region;
import com.project.virus.services.CasesByRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CasesByRegionController {

    @Autowired
    CasesByRegionService casesByRegionService;

    @GetMapping("/cases")
    public String cases(Model model){

        List<Region> regionsDataList = casesByRegionService.getRegionsDataList();

        model.addAttribute("regionsDataList", regionsDataList);

        return "cases";
    }



}
