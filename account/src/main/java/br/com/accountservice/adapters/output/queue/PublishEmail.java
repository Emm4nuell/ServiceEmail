package br.com.accountservice.adapters.output.queue;

import br.com.accountservice.adapters.output.request.RequestPublishEmail;
import br.com.accountservice.infrastructure.constants.ConstRabbitMq;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PublishEmail implements IPublishEmail {

    private final RabbitTemplate rabbitTemplate;

    @Override
    public void publish(String request) {
        rabbitTemplate.convertAndSend(
                ConstRabbitMq.EXCHANGE_SEND_EMAIL,
                ConstRabbitMq.ROUTING_KEY_SEND_EMAIL,
                request);

    }
}
