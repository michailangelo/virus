package com.project.virus.services;

import com.project.virus.models.TotalCases;
import com.project.virus.models.TotalStatistics;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    private static String DATA_URL = "https://covid-19-greece.herokuapp.com/total";

    List<TotalCases> totalDataList = new ArrayList<>();

    public List<TotalCases> getTotalDataList() {
        return totalDataList;
    }

    public void setTotalDataList(List<TotalCases> totalDataList) {
        this.totalDataList = totalDataList;
    }

    @Override
    @PostConstruct
    @Scheduled(cron = "0 */30 * * * *")
    public void fetchData() throws IOException, InterruptedException, ParseException {

        //Getting the data from the api in jason format using HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(DATA_URL)).build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

        //Parsing the data and loading them into a jason object
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(httpResponse.body());

        //Mapping the jason object to our model in order to communicate it to the front-end of the app
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        TotalStatistics totalStatistics = objectMapper.readValue(jsonObject.toString(), TotalStatistics.class);
        this.totalDataList.add(totalStatistics.getCases());
    }

}
