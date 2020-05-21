// Author: John Matzakos | Date: 21/05/2020

package com.project.virus.services;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface VirusService {

    void fetchData() throws IOException, InterruptedException, ParseException, java.text.ParseException;

    List<String> getRegionList();

    List<String> getCountyList();

    List<Integer> getConfirmedCasesList();

    List<Integer> getDeathsList();

    List<Integer> getHospitalizedList();

    List<Integer> getCriticalCasesList();

    List<Integer> getRecoveredCasesList();
}
