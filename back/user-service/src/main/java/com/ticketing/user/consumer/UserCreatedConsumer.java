package com.ticketing.user.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserCreatedConsumer {

//    @KafkaListener(topics = "user.created", groupId = "ticketing-group")
//    public void consumer(
//            @Payload UserCreatedEvent event
//    ) {
//        log.info("Consumed event : {}", event);
//    }
//
//    @KafkaListener(topics = "user.payment", groupId = "payment-group")
//    public void payConsumer(
//            @Payload PaymentEvent event
//    ) {
//        log.info("payment event : {}", event);
//    }

}
