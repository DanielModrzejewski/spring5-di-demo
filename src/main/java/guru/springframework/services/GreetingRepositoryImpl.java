package guru.springframework.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getPolishGreeting() {
        return "Siema - Polska biao-czerwoni";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";

    }
}
