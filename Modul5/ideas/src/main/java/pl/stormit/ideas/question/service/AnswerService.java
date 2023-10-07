package pl.stormit.ideas.question.service;

import org.springframework.stereotype.Service;
import pl.stormit.ideas.question.domain.model.Answer;
import pl.stormit.ideas.question.domain.model.Question;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class AnswerService {
    public List<Answer> getAnswers(UUID questionId) {
        return Arrays.asList(new Answer("Answer 1"), new Answer("Answer 2"));
    }

    public Answer getAnswer(UUID id) {
        return new Answer("Answer, " + "Answer id: " + id);
    }

    public Answer createAnswer(UUID answerId, Answer answer) {
        return null;
    }

    public Answer updateAnswer(UUID answerId, Answer answer) {
        return null;
    }

    public void deleteAnswer(UUID id) {
    }
}
