package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand fingByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
