package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryGreetengService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hello - primary greeting service";
    }
}
