package pl.stormit.ideas.category.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.stormit.ideas.category.domain.model.Category;
import pl.stormit.ideas.category.service.CategoryService;
import pl.stormit.ideas.question.domain.model.Question;
import pl.stormit.ideas.question.service.QuestionService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {


	private final CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping
	List<Category> getCategorys(){
		return categoryService.getCategorys();
	}

	@GetMapping("{id}")
	Category getCategory(@PathVariable UUID id){
		return categoryService.getCategory(id);
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	Category createCategory(@RequestBody Category category){
		return categoryService.createCategory(category);
	}

	@ResponseStatus(HttpStatus.ACCEPTED)
	@PutMapping("{id}")
	Category updateCategory(@PathVariable UUID id, @RequestBody Category category){
		return categoryService.updateCategory(id, category);
	}
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("{id}")
	void deleteCategory(@PathVariable UUID id){
		categoryService.deleteCategory(id);

	}
}
