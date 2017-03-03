package com.yundata.mq;


import Mq.exchange.Exchange;
import Mq.queue.Queues;
import Mq.routingkey.Routingkey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Sender implements RabbitTemplate.ConfirmCallback {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

    private RabbitTemplate rabbitTemplate;

    @Autowired
    public Sender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
        this.rabbitTemplate.setConfirmCallback(this);
    }

    public void send(String msg) {
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        LOGGER.info("send: " + correlationData.getId());

        //广播模式，监听同一路由的队列都会收到
        this.rabbitTemplate.convertAndSend(Exchange.EXCHANGE_DEMO, Routingkey.ROUTINGKEY_DEMO, msg, correlationData);

        //点对点模式，消息直接发送到队列里面
//        this.rabbitTemplate.convertAndSend(Queues.QUEUE_DEMO_1, msg);
    }

    /**
     * 回调方法
     */
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        LOGGER.info("confirm: " + correlationData.getId());
    }
}