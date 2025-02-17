package br.com.accountservice.adapters.input.api;

import br.com.accountservice.adapters.input.api.response.ResponseAccount;
import br.com.accountservice.adapters.input.api.request.RequestAccount;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/account")
public interface IApiController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    ResponseAccount created(@RequestBody RequestAccount requestAccount);
}
