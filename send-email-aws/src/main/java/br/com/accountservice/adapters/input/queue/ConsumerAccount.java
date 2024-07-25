package br.com.accountservice.adapters.input.queue;

import br.com.accountservice.application.domain.model.SendEmailModel;
import br.com.accountservice.application.port.in.ISendEmailUseCase;
import br.com.accountservice.infrastructure.constants.ConstRabbitMq;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.mail.MessagingException;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConsumerAccount {

    private final ISendEmailUseCase iSendEmailUseCase;

    @RabbitListener(queues = ConstRabbitMq.QUEUE_SEND_EMAIL)
    public void consumerMessage(@Payload String object) throws MessagingException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            var request = mapper.readValue(object, SendEmailModel.class);
            iSendEmailUseCase.sendEmail(request);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
