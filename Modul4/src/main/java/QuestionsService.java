package pl.tazz.zadaniedomowe;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Service
public class QuestionsService {

    private final ZadanieConfiguration zadanieConfiguration;

    public QuestionsService(ZadanieConfiguration zadanieConfiguration) {
        this.zadanieConfiguration = zadanieConfiguration;
    }

    public List<User> getUsers() {
        return Arrays.asList(
                new User("Maciej","49"),
                new User("Ewa","43")
        );
    }

    public String age(String ageValue) {
    return String.format("Cześć %s %s", zadanieConfiguration.getName(), ageValue);
    }
}
