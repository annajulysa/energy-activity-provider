package com.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class AnalyticsListController {

    @GetMapping("/analytics-list")
    public Map<String, Object> getList() {
        return Map.of(
            "available", List.of("energy_daily", "energy_weekly", "temp_history")
        );
    }
}
