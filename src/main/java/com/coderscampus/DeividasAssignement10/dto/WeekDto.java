package com.coderscampus.DeividasAssignement10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekDto {
    @JsonProperty("monday")
    private SpoonacularResponseDay monday;
    @JsonProperty("tuesday")
    private SpoonacularResponseDay tuesday;
    @JsonProperty("wednesday")
    private SpoonacularResponseDay wednesday;
    @JsonProperty("thursday")
    private SpoonacularResponseDay thursday;
    @JsonProperty("friday")
    private SpoonacularResponseDay friday;
    @JsonProperty("saturday")
    private SpoonacularResponseDay saturday;
    @JsonProperty("sunday")
    private SpoonacularResponseDay sunday;
}
