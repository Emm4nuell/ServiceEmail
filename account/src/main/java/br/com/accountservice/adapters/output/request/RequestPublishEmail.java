package br.com.accountservice.adapters.output.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestPublishEmail implements Serializable {
    private String name;
    private String to;
    private String subject;
    private String text;
    private Date account_data;
}
