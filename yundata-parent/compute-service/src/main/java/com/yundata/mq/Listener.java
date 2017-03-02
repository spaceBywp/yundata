package com.yundata.mq;


import Mq.exchange.Exchange;
import Mq.queue.Queues;
import Mq.routingkey.Routingkey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Payload;

@Configuration
@RabbitListener(queues = Queues.QUEUE_DEMO_1)
public class Listener {

    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);

    /**
     * 设置交换机类型
     */
    @Bean
    public DirectExchange defaultExchange() {
        /**
         * DirectExchange:按照routingkey分发到指定队列
         * TopicExchange:多关键字匹配
         * FanoutExchange: 将消息分发到所有的绑定队列，无routingkey的概念
         * HeadersExchange ：通过添加属性key-value匹配
         */
        return new DirectExchange(Exchange.EXCHANGE_DEMO);
    }

    @Bean
    public Queue fooQueue() {
        return new Queue(Queues.QUEUE_DEMO_1);
    }

    @Bean
    public Binding binding() {
        /** 将队列绑定到交换机 */
        return BindingBuilder.bind(fooQueue()).to(defaultExchange()).with(Routingkey.ROUTINGKEY_DEMO);
    }

    @RabbitHandler
    public void process(@Payload String foo) {
        LOGGER.info("Listener: " + foo);
    }
}