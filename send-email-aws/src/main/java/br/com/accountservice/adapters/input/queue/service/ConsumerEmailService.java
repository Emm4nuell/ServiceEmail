package br.com.accountservice.adapters.input.queue.service;

import br.com.accountservice.application.domain.model.SendEmailModel;
import br.com.accountservice.application.port.in.ISendEmailUseCase;
import org.springframework.stereotype.Service;

@Service
public class ConsumerEmailService implements ISendEmailUseCase {
    @Override
    public void sendEmail(SendEmailModel emailModel) {

    }
}
