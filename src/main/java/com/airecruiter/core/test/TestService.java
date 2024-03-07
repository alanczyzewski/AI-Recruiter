package com.airecruiter.core.test;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class TestService {

    private final OpenAiChatClient openAiChatClient;

    public String callChatGPT(String prompt) {
        return openAiChatClient.call(prompt);
    }
}
