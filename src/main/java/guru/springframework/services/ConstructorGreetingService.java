package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    private final String HELLO_CONSTRUCTOR = "hello - i was injected by constructor";

    @Override
    public String sayGreeting() {
        return HELLO_CONSTRUCTOR;
    }
}
