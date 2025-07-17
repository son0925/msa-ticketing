package com.ticketing.user.consumer;

import com.ticketing.model.user.UserCreatedEvent;
import com.ticketing.payment.PaymentEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserCreatedConsumer {

    @KafkaListener(topics = "user.created", groupId = "ticketing-group")
    public void consumer(
            @Payload UserCreatedEvent event
    ) {
        log.info("Consumed event : {}", event);
    }

    @KafkaListener(topics = "user.payment", groupId = "payment-group")
    public void payConsumer(
            @Payload PaymentEvent event
    ) {
        log.info("payment event : {}", event);
    }

}
