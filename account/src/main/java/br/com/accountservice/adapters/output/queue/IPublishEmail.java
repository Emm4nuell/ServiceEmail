package br.com.accountservice.adapters.output.queue;

import br.com.accountservice.adapters.output.request.RequestPublishEmail;

public interface IPublishEmail {
    void publish(String request);
}
