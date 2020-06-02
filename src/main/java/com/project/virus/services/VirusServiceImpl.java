package com.project.virus.services;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.project.virus.models.Covid19Data;
import org.springframework.stereotype.Service;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    public void fetchData() throws IOException, InterruptedException, ParseException {
        Path dataLocationPath = Paths.get(DATA_LOCATION);

        try (Reader reader = new BufferedReader(Files.newBufferedReader(dataLocationPath))) {
            // create csv bean reader
            CsvToBean csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Covid19Data.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            // convert `CsvToBean` object to list of data
             dataList = csvToBean.parse();
        }
    }

}
