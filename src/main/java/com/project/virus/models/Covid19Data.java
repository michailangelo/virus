package com.project.virus.models;

import java.io.Serializable;

public class Covid19Data implements Serializable {

    private String country;

    private String region;

    private String county;

    private Integer confirmedCases;

    private Integer deaths;

    private Integer hospitalized;

    private Integer criticalCases;

    private Integer recoveredCases;

    public String getCountry() {
        return country;
    }

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
}
