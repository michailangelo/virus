package com.project.virus.models;

import java.io.Serializable;

public class Covid19 implements Serializable {

    private Country country;

    private Cases cases;

    public Country getCountry() {
        return country;
    }

    public Cases getCases() {
        return cases;
    }
}
