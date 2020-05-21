// Author: John Matzakos | Date: 21/05/2020

package com.project.virus.models;

import java.io.Serializable;

public class CasesPerCounty implements Serializable {

    private String region;

    private String county;

    private Integer confirmedCases;

    private Integer deaths;

    private Integer hospitalized;

    private Integer criticalCases;

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
}
