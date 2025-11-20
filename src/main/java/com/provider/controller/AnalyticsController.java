package com.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class AnalyticsController {

    @GetMapping("/analytics")
    public Map<String, Object> getAnalytics(@RequestParam String type) {

        if(type.equals("energy_daily")) {
            return Map.of(
                "type", "energy_daily",
                "unit", "kWh",
                "values", new int[]{ 2, 3, 1, 5 }
            );
        }

        if(type.equals("temp_history")) {
            return Map.of(
                "type", "temp_history",
                "unit", "celsius",
                "values", new int[]{ 55, 57, 54, 56 }
            );
        }

        return Map.of(
            "error", "Analytics type not found"
        );
    }
}
