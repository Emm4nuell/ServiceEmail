package br.com.accountservice.application.port.out;

import br.com.accountservice.application.domain.model.SendEmailModel;

public interface ISendEmailService {
    void sendEmail(SendEmailModel emailModel);
}
