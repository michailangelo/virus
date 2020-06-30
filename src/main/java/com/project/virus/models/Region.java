// Author: John Matzakos | Date: 30/06/2020

package com.project.virus.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Region implements Serializable {

    @JsonProperty("cases_per_100000_people")
    private String cases_per_100000_people;

    @JsonProperty("population")
    private String population;

    @JsonProperty("region_cases")
    private String region_cases;

    @JsonProperty("region_en_name")
    private String region_en_name;

    @JsonProperty("region_gr_name")
    private String region_gr_name;

    public String getCases_per_100000_people() {
        return cases_per_100000_people;
    }

    public void setCases_per_100000_people(String cases_per_100000_people) {
        this.cases_per_100000_people = cases_per_100000_people;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getRegion_cases() {
        return region_cases;
    }

    public void setRegion_cases(String region_cases) {
        this.region_cases = region_cases;
    }

    public String getRegion_en_name() {
        return region_en_name;
    }

    public void setRegion_en_name(String region_en_name) {
        this.region_en_name = region_en_name;
    }

    public String getRegion_gr_name() {
        return region_gr_name;
    }

    public void setRegion_gr_name(String region_gr_name) {
        this.region_gr_name = region_gr_name;
    }

    @Override
    public String toString() {
        return "Region{" +
                "cases_per_100000_people='" + cases_per_100000_people + '\'' +
                ", population='" + population + '\'' +
                ", region_cases='" + region_cases + '\'' +
                ", region_en_name='" + region_en_name + '\'' +
                ", region_gr_name='" + region_gr_name + '\'' +
                '}';
    }
}
