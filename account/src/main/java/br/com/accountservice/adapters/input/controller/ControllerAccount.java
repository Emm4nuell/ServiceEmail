package br.com.accountservice.adapters.input.controller;

import br.com.accountservice.adapters.input.api.IApiController;
import br.com.accountservice.adapters.input.api.request.ResponseAccount;
import br.com.accountservice.adapters.input.api.response.RequestAccount;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAccount implements IApiController {
    @Override
    public ResponseAccount created(RequestAccount requestAccount) {
        return ResponseAccount.builder().mensage("Created account success!").build();
    }
}
