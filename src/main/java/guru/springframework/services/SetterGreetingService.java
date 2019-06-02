package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

    private final String HELLO_GETTER = "hello - i was injected by setter";

    @Override
    public String sayGreeting() {
        return HELLO_GETTER;
    }
}
