package com.example.kafaka;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@SpringBootApplication
@EnableScheduling
public class KafakaApplication {
    private static Logger logger = LoggerFactory.getLogger(KafakaApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(KafakaApplication.class, args);
        test();

    }
    @Scheduled(fixedRate = 3000)
    public static void test(){
            logger.info("inside method"+ LocalTime.now());
    }

}
