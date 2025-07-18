package com.ticketing.user.controller;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.internals.RecordHeader;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.requestreply.ReplyingKafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserKafkaTestController {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final ReplyingKafkaTemplate<String, Object, Object> replyingKafkaTemplate;

    // 단순 메시지 전송 (응답 필요 없음)
//    @PostMapping("/event-test")
//    public Mono<String> sendKafkaEvent(@RequestBody UserCreatedEvent event) {
//        kafkaTemplate.send("user.created", event);
//        return Mono.just("Event Sent");
//    }
//
//    // 결제 응답 수신 (Request-Reply)
//    @PostMapping("/pay")
//    public Mono<String> paymentEvent(@RequestBody PaymentEvent event) {
//        ProducerRecord<String, Object> record = new ProducerRecord<>("user.payment", event);
//        record.headers().add(new RecordHeader(KafkaHeaders.REPLY_TOPIC, "user.payment.reply".getBytes()));
//        return Mono.fromFuture(
//                replyingKafkaTemplate.sendAndReceive(record)
//                        .toCompletableFuture()
//                        .thenApply(response -> "결제 응답 받음: " + response.value())
//        );
//    }
}
