package com.airecruiter.core.test;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Tag(name = "Test endpoints")
@RequiredArgsConstructor
class TestController {

    private final TestService testService;

    @GetMapping
    String test(@RequestParam String prompt) {
        return testService.callChatGPT(prompt);
    }
}
