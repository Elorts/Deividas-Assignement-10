package com.coderscampus.DeividasAssignement10.web;

import com.coderscampus.DeividasAssignement10.dto.SpoonacularResponseDay;
import com.coderscampus.DeividasAssignement10.dto.SpoonacularResponseWeek;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class MealPlannerController {

    @GetMapping("mealplanner/week")
    public ResponseEntity<SpoonacularResponseWeek> getWeekMeals(String numCalories, String diet, String exclusions) {


        RestTemplate rt = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", "week")
                .queryParam("apiKey", "52008d4850ec4abcbd7b3bfe88f99ffc")
                .build()
                .toUri();

        ResponseEntity<SpoonacularResponseWeek> response =  rt.getForEntity(uri, SpoonacularResponseWeek.class);
        System.out.println(response.getBody());

        return response;



    }

    @GetMapping("mealplanner/day")
    public ResponseEntity<SpoonacularResponseDay> getDayMeals(String numCalories, String diet, String exclusions) {

        RestTemplate rt = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", "day")
                .queryParam("apiKey", "52008d4850ec4abcbd7b3bfe88f99ffc")
                .build()
                .toUri();

        ResponseEntity<SpoonacularResponseDay> response =  rt.getForEntity(uri, SpoonacularResponseDay.class);
        System.out.println(response.getBody());

        return response;
    }
}
