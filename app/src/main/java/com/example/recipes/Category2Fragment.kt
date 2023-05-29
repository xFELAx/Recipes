package com.example.recipes

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Category2Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val recipeRecycler =
            inflater.inflate(R.layout.fragment_recipe_list, container, false) as RecyclerView
        val recipeNames = Array(Recipe.category2.size) { i -> Recipe.category2[i].name }
        val recipeImages = Array(Recipe.category2.size) { i -> Recipe.category2[i].imageResourceId }
        val listener = CaptionedImagesAdapter.Listener { position ->
            val intent = Intent(activity, RecipeDetailActivity::class.java)
            intent.putExtra(RecipeDetailActivity.EXTRA_DISH_ID, position.toLong())
            intent.putExtra(RecipeDetailActivity.EXTRA_CATEGORY, "category2")
            activity?.startActivity(intent)
        }
        val adapter = CaptionedImagesAdapter(recipeNames, recipeImages, listener)
        recipeRecycler.adapter = adapter
        val layoutManager = GridLayoutManager(activity, 2)
        recipeRecycler.layoutManager = layoutManager
        return recipeRecycler
    }


}