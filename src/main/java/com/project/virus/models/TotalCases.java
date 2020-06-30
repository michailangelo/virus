package com.project.virus.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class TotalCases implements Serializable {

    @JsonProperty("date")
    private String date;

    @JsonProperty("confirmed")
    private String confirmed;

    @JsonProperty("active")
    private String active;

    @JsonProperty("deaths")
    private String deaths;

    @JsonProperty("recovered")
    private String recovered;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    @Override
    public String toString() {
        return "TotalCases{" +
                "date=" + date +
                ", confirmed=" + confirmed +
                ", active=" + active +
                ", deaths=" + deaths +
                ", recovered=" + recovered +
                '}';
    }
}
