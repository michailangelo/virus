package com.project.virus.services;

import com.project.virus.models.Covid19Data;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class VirusServiceImpl implements VirusService {

    private static String DATA_LOCATION = "src/main/resources/data/greece.csv";

    List<Covid19Data> dataList = new ArrayList<>();

    @Override
    public List<Covid19Data> getDataList() {
        return dataList;
    }

    @Override
    public void fetchData() throws IOException, InterruptedException, ParseException, java.text.ParseException {
        //TODO: fetch the necessary data from the csv file and load the lists that correspond to the appropriate columns
    }

}
