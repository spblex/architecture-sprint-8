package ru.spblex.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.time.LocalTime;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @GetMapping
    @PreAuthorize("hasAuthority('prothetic_user')")
    public Map<String, Object> reports() {
        Map<String, Object> response = new HashMap<>();
        response.put("date", LocalTime.now());
        response.put("data", List.of("Здесь мог бы быть ваш отчет!"));
        return response;
    }
}