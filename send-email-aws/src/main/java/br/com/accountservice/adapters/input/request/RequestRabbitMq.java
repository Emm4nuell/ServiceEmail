package br.com.accountservice.adapters.input.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestRabbitMq {
    private String name;
    private String to;
    private String subject;
    private String text;
    private Date account_data;
}
