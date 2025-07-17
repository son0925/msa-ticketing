package com.ticketing.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.requestreply.ReplyingKafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserKafkaTestController {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final ReplyingKafkaTemplate<String, Object, Object> replyingKafkaTemplate;


}
