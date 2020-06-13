package com.demo.ingredisearch.features.details;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.demo.ingredisearch.models.Recipe;
import com.demo.ingredisearch.util.Resource;

class RecipeDetailsViewModel extends AndroidViewModel {

    private static final String TAG = "RecipeApp";

//    private RecipeRepository mRepository;

    public RecipeDetailsViewModel(@NonNull Application application) {
        super(application);
//        this.mRepository = RecipeRepository.getInstance(application);
    }
    public LiveData<Resource<Recipe>> getRecipe() {
//        return mRepository.getRecipe();
        return null;
    }

    public void searchRecipe(String recipeId) {
//        mRepository.searchRecipe(recipeId);
    }
}
