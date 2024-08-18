package com.talkpossible.project.domain.dto.chat.request;

import lombok.Data;

import java.util.List;

/**
 * ChatRequest - 스트리밍 방식으로 응답받기 위해 stream 필드 추가
 */
@Data
public class ChatStreanRequest {

    private String model;
    private List<Message> messages;
    private int n;
    private double temperature;
    private boolean stream;

    public ChatStreanRequest(String model, List<Message> messages) {
        this.model = model;

//        this.messages = new ArrayList<>();
//        this.messages.add(new Message("user", prompt));

        this.messages = messages;

        this.n = 1;
        this.temperature = 0.5;

        this.stream = true;
    }
}