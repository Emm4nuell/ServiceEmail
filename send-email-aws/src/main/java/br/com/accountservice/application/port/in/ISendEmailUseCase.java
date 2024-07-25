package br.com.accountservice.application.port.in;

import br.com.accountservice.application.domain.model.SendEmailModel;

public interface ISendEmailUseCase {
    void sendEmail(SendEmailModel emailModel);
}
