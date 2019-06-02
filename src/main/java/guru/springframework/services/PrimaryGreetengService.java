package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetengService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hello - primary greeting service";
    }
}
