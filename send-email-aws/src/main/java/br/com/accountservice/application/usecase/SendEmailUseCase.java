package br.com.accountservice.application.usecase;

import br.com.accountservice.application.domain.model.SendEmailModel;
import br.com.accountservice.application.port.in.ISendEmailUseCase;
import br.com.accountservice.application.port.out.ISendEmailService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SendEmailUseCase implements ISendEmailUseCase {

    private final ISendEmailService iSendEmailService;

    @Override
    public void sendEmail(SendEmailModel emailModel) {
        emailModel.setSubject("Email enviado via --> smtp.gmail.com");
        emailModel.setText("Validação smtp.gmail.com realizdo com sucesso!");
        iSendEmailService.sendEmail(emailModel);
    }
}
