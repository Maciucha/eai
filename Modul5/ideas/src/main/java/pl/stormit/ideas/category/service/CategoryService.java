package pl.stormit.ideas.category.service;

import org.springframework.stereotype.Service;
import pl.stormit.ideas.category.domain.model.Category;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class CategoryService {
    public List<Category> getCategorys() {
        return Arrays.asList(new Category("Category 1"), new Category("Category 2"));
    }

    public Category getCategory(UUID id) {
        return new Category("Category, " + "Category id: " + id);
    }

    public Category createCategory(Category category) {
        return null;
    }

    public Category updateCategory(UUID id, Category category) {
        return null;
    }

    public void deleteCategory(UUID id) {
    }
}
