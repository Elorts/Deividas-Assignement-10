package com.coderscampus.DeividasAssignement10.web;

import com.coderscampus.DeividasAssignement10.dto.SpoonacularResponseDay;
import com.coderscampus.DeividasAssignement10.dto.SpoonacularResponseWeek;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;

@RestController
public class MealPlannerController {

    @Value("${myapp.api.url}")
    private String apiUrl;

    @GetMapping("mealplanner/week") 
    public ResponseEntity<SpoonacularResponseWeek> getWeekMeals(String numCalories, String diet, String exclusions) {


        RestTemplate rt = new RestTemplate();

        //"https://api.spoonacular.com/mealplanner/generate"
        URI uri = UriComponentsBuilder.fromHttpUrl(apiUrl)
                .queryParam("timeFrame", "week")
                .queryParam("apiKey", "52008d4850ec4abcbd7b3bfe88f99ffc")
                .queryParam("targetCalories", numCalories)
                .queryParam("diet", diet)
                .queryParam("exclude", exclusions)
                .build()
                .toUri();

        ResponseEntity<SpoonacularResponseWeek> response =  rt.getForEntity(uri, SpoonacularResponseWeek.class);
        return response;
    }

    @GetMapping("mealplanner/day")
    public ResponseEntity<SpoonacularResponseDay> getDayMeals(String numCalories, String diet, String exclusions) {

        RestTemplate rt = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl(apiUrl)
                .queryParam("timeFrame", "day")
                .queryParam("apiKey", "52008d4850ec4abcbd7b3bfe88f99ffc")
                .queryParam("targetCalories", numCalories)
                .queryParam("diet", diet)
                .queryParam("exclude", exclusions)
                .build()
                .toUri();

        ResponseEntity<SpoonacularResponseDay> response =  rt.getForEntity(uri, SpoonacularResponseDay.class);
        return response;
    }
}
