// Author: John Matzakos | Date: 21/05/2020

package com.project.virus.services;

import com.project.virus.models.Covid19Data;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface VirusService {

    void fetchData() throws IOException, InterruptedException, ParseException;

    List<Covid19Data> getDataList();

}
