package br.com.accountservice.adapters.output.sendemail.service;

import br.com.accountservice.application.domain.model.SendEmailModel;
import br.com.accountservice.application.port.out.ISendEmailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SendEmailService implements ISendEmailService {

    private final JavaMailSender javaMailSender;

    @Override
    public void sendEmail(SendEmailModel emailModel) {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(emailModel.getTo());
            helper.setSubject(emailModel.getSubject());
            helper.setText(emailModel.getText(), true); // true indicates that the content is HTML
            javaMailSender.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
