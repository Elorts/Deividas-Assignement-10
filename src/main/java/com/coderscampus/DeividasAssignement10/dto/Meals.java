package com.coderscampus.DeividasAssignement10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meals {
    @JsonProperty("id")
    private String id;
    @JsonProperty("imageType")
    private String imageType;
    @JsonProperty("title")
    private String title;
    @JsonProperty("readyInMinutes")
    private String readyInMinutes;
    @JsonProperty("servings")
    private String servings;
    @JsonProperty("sourceUrl")
    private String sourceUrl;
}
