// Author: John Matzakos | Date: 30/06/2020

package com.project.virus.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RegionStatistics implements Serializable {

    @JsonProperty("regions")
    private Region[] regions;

    public Region[] getRegions() {
        return regions;
    }

    public void setCases(Region[] regions) {
        this.regions = regions;
    }


}
