package com.aahar.Service.Impl;

import com.aahar.Entity.Recipe;
import com.aahar.Entity.User;
import com.aahar.Service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {
    @Override
    public Recipe createRecipe(Recipe recipe, User user) {
//        Recipe newrecipe = new Recipe();
//        newrecipe.setTitle(recipe.getTitle());

        return null;
    }

    @Override
    public Recipe findRecipeById(Long id) throws Exception {
        return null;
    }

    @Override
    public void deleteRecipe(Long id) throws Exception {

    }

    @Override
    public Recipe updateRecipe(Recipe recipe, Long id) throws Exception {
        return null;
    }

    @Override
    public List<Recipe> findAllRecipe() {
        return null;
    }

    @Override
    public Recipe likeRecipe(Long id, User user) throws Exception {
        return null;
    }
}
