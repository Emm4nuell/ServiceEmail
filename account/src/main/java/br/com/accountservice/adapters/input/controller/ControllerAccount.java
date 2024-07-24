package br.com.accountservice.adapters.input.controller;

import br.com.accountservice.adapters.input.api.IApiController;
import br.com.accountservice.adapters.input.api.request.ResponseAccount;
import br.com.accountservice.adapters.input.api.response.RequestAccount;
import br.com.accountservice.application.domain.model.AccountModel;
import br.com.accountservice.application.ports.in.ICreateAccontUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ControllerAccount implements IApiController {

    private final ICreateAccontUseCase iCreateAccontUseCase;

    @Override
    public ResponseAccount created(RequestAccount requestAccount) {
        var domain = AccountModel.builder()
                .name(requestAccount.getName())
                .document(requestAccount.getDocument())
                .email(requestAccount.getEmail())
                .birthdate(requestAccount.getBirthdate())
                .build();
        iCreateAccontUseCase.create(domain);
        return ResponseAccount.builder().mensage("Created account success!").build();
    }
}
