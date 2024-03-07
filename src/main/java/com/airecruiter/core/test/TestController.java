package com.airecruiter.core.test;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Tag(name = "Test endpoints")
public class TestController {
    @GetMapping
    String test() {
        return "test";
    }
}
