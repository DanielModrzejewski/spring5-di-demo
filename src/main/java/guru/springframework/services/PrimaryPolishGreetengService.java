package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("pl")
public class PrimaryPolishGreetengService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "witaj - wstrzykniete przez PrimaryPolishGreetengService";
    }
}
