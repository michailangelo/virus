package com.project.virus.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class TotalStatistics implements Serializable {

    @JsonProperty("cases")
    private TotalCases cases;

    public TotalCases getCases() {
        return cases;
    }

    public void setCases(TotalCases cases) {
        this.cases = cases;
    }
}
