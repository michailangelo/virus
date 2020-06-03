package com.project.virus.models;

import com.opencsv.bean.CsvBindByName;

import java.io.Serializable;

public class Covid19Data implements Serializable {

    @CsvBindByName
    private String region;

    @CsvBindByName
    private String county;

    @CsvBindByName
    private Integer confirmedCases;

    @CsvBindByName
    private Integer deaths;

    @CsvBindByName
    private Integer hospitalized;

    @CsvBindByName
    private Integer criticalCases;

    @CsvBindByName
    private Integer recoveredCases;

    public String getRegion() {
        return region;
    }

    public String getCounty() {
        return county;
    }

    public Integer getConfirmedCases() {
        return confirmedCases;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public Integer getHospitalized() {
        return hospitalized;
    }

    public Integer getCriticalCases() {
        return criticalCases;
    }

    public Integer getRecoveredCases() {
        return recoveredCases;
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "region='" + region + '\'' +
                ", county='" + county + '\'' +
                ", confirmedCases=" + confirmedCases +
                ", deaths=" + deaths +
                ", hospitalized=" + hospitalized +
                ", criticalCases=" + criticalCases +
                ", recoveredCases=" + recoveredCases +
                '}';
    }
}
