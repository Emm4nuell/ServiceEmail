package br.com.accountservice.adapters.output.queue.service;

import br.com.accountservice.adapters.output.queue.IPublishEmail;
import br.com.accountservice.adapters.output.request.RequestPublishEmail;
import br.com.accountservice.application.domain.model.AccountModel;
import br.com.accountservice.application.ports.out.ISendEmail;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PublishEmailService implements ISendEmail {

    private final IPublishEmail iPublishEmail;

    @Override
    public void publish(AccountModel accountModel) {
        var msgemail = RequestPublishEmail.builder()
                .name(accountModel.getName())
                .subject("Enviado via RabbitMq!")
                .text("Prezado(a) " + accountModel.getName() +
                        " sua conta foi criada com sucesso!" + accountModel.getAccount_data())
                .to(accountModel.getEmail())
                .build();

        try {
            ObjectMapper mapper = new ObjectMapper();
            var writeAccount = mapper.writeValueAsString(msgemail);
            iPublishEmail.publish(writeAccount);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
