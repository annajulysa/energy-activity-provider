package com.provider.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class DeployController {

    @PostMapping("/deploy")
    public Map<String, Object> deploy(@RequestBody Map<String, Object> body) {
        return Map.of(
            "status", "success",
            "receivedUser", body.get("user"),
            "message", "Activity deployed with default settings"
        );
    }
}
