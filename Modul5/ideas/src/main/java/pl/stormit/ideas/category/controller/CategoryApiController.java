package pl.stormit.ideas.category.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.stormit.ideas.category.model.Category;
import pl.stormit.ideas.category.service.CategoryService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryApiController {


    private final CategoryService categoriesService;

    public CategoryApiController(CategoryService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @GetMapping
    List<Category> getCategories(){
        return categoriesService.getCategories();
    }

    @GetMapping("{id}")
    Category getCategory(@PathVariable UUID id){
        return categoriesService.getCategory(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    Category createCategory(@RequestBody Category category){
        return categoriesService.createCategory(category);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("{id}")
    Category updateCategory(@PathVariable UUID id, @RequestBody Category category){
        return categoriesService.updateCategory(id, category);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    void deleteCategory(@PathVariable UUID id){
        categoriesService.deleteCategory(id);

    }

}
