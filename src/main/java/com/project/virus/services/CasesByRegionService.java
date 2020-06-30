// Author: John Matzakos | Date: 30/06/2020

package com.project.virus.services;

import com.project.virus.models.Region;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface CasesByRegionService {

    void fetchData() throws IOException, InterruptedException, ParseException, org.json.simple.parser.ParseException;

    List<Region> getRegionsDataList();

}
