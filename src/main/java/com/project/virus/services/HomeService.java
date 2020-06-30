// Author: John Matzakos | Date: 21/05/2020

package com.project.virus.services;

import com.project.virus.models.TotalCases;
import org.springframework.boot.configurationprocessor.json.JSONException;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface HomeService {

    void fetchData() throws IOException, InterruptedException, JSONException, org.json.simple.parser.ParseException;

    List<TotalCases> getTotalDataList();

}
