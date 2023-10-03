package pl.tazz.zadaniedomowe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
@RequestMapping("users")
public class QuestionsController {

    private final QuestionsService userService;

    public QuestionsController(QuestionsService userService) {
        this.userService = userService;
    }
@GetMapping
    List<User> getUsers() {
        return userService.getUsers();
    }
    @GetMapping("/age")
    String age(@RequestParam String ageValue){
    return userService.age(ageValue);
    }
}
