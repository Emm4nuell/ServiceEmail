package br.com.accountservice.infrastructure.config;

import br.com.accountservice.infrastructure.constants.ConstRabbitMq;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {

    @Bean
    public Queue queueSendEmail(){
        return new Queue(ConstRabbitMq.QUEUE_SEND_EMAIL, true);
    }

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange(ConstRabbitMq.EXCHANGE_SEND_EMAIL);
    }

    @Bean
    public Binding bindingBuilder(){
        return BindingBuilder.bind(
                queueSendEmail())
                .to(directExchange())
                .with(ConstRabbitMq.ROUTING_KEY_SEND_EMAIL);
    }
}
