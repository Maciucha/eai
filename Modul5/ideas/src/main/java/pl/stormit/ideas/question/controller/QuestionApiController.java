package pl.stormit.ideas.question.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.stormit.ideas.question.service.QuestionService;
import pl.stormit.ideas.question.domain.model.Question;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/questions")
public class QuestionApiController {


	private final QuestionService questionsService;

	public QuestionApiController(QuestionService questionsService) {
		this.questionsService = questionsService;
	}

	@GetMapping
	List<Question> getQuestions(){
		return questionsService.getQuestions();
	}

	@GetMapping("{id}")
	Question getQuestion(@PathVariable UUID id){
		return questionsService.getQuestion(id);
	}
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	Question createQuestion(@RequestBody Question question){
		return questionsService.createQuestion(question);
	}

	@ResponseStatus(HttpStatus.ACCEPTED)
	@PutMapping("{id}")
	Question updateQuestion(@PathVariable UUID id, @RequestBody Question question){
		return questionsService.updateQuestion(id, question);
	}
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("{id}")
	void deleteQuestion(@PathVariable UUID id){
		questionsService.deleteQuestion(id);

	}
}
