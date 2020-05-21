// Author: John Matzakos | Date: 21/05/2020

package com.project.virus.models;

import java.io.Serializable;

public class Country implements Serializable {

    private String name;

    private String countryCode;

    private String region;

    private String county;

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getRegion() {
        return region;
    }

    public String getCounty() {
        return county;
    }

}
