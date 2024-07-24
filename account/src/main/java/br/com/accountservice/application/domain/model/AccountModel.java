package br.com.accountservice.application.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountModel {
    private Long id;
    private String name;
    private String document;
    private String email;
    private Date birthdate;
    private Boolean account_status;
    private LocalDateTime account_data;
    private LocalDateTime update_data;
}
