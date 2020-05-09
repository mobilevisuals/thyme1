package com.example.thymeleaf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.util.Map;

@Controller
public class MyController {

    @Value("${application.message}")
    private String message = "Hi there";

    @GetMapping("/")
    public String index(Map<String, Object> model) {

        model.put("now", LocalDate.now());
        model.put("message", this.message);
        return "index";
    }
}
