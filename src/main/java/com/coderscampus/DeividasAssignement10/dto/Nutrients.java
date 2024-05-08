package com.coderscampus.DeividasAssignement10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {
    @JsonProperty("calories")
    private String calories;
    @JsonProperty("protein")
    private String protein;
    @JsonProperty("fat")
    private String fat;
    @JsonProperty("carbohydrates")
    private String carbohydrates;
}
