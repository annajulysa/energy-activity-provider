package com.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class ParamsController {

    @GetMapping("/params")
    public Map<String, Object> getParams() {
        return Map.of(
            "temperature", Map.of(
                "min", 30,
                "max", 75
            ),
            "mode", new String[]{"eco", "normal", "turbo"}
        );
    }
}
