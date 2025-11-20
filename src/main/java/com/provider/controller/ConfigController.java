package com.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class ConfigController {

    @GetMapping("/config")
    public Map<String, Object> getConfig() {
        return Map.of(
            "name", "EnergyConsumptionManager",
            "description", "Demo Activity Provider for termoacumulador",
            "version", "1.0"
        );
    }
}

