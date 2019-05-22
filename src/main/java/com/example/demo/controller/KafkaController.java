package com.example.demo.controller;

import com.example.demo.domain.Message;
import com.example.demo.kafka.producer.KafkaSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.UUID;

@RestController
  @RequestMapping("/kafka")
  public class KafkaController {
        protected final Logger logger = LoggerFactory.getLogger(this.getClass());

        @Autowired
        private KafkaSender sender;

        @RequestMapping(value = "/send", method = RequestMethod.GET)
        public String sendKafka() {
            Message message = new Message();

            UUID uuid = UUID.randomUUID();
            String uuidString = uuid.toString();

            message.setId(uuidString);
            message.setCode(21);
            message.setMsg("第一次发送");
            message.setSendTime(new Date(System.currentTimeMillis()));
            try {
                logger.info("kafka的消息={}", message);
                sender.send(message);
                logger.info("发送kafka成功.");
                return "SUCCESS";
            } catch (Exception e) {
                logger.error("发送kafka失败", e);
                return "FAIL";
            }
        }
    }

