package com.coderscampus.DeividasAssignement10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SpoonacularResponseDay {

    @JsonProperty("meals")
    private List<Meals> meals;

    @JsonProperty("nutrients")
    private Nutrients nutrients;
}
