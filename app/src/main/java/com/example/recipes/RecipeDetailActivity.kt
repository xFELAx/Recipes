package com.example.recipes

import android.os.Bundle
import android.support.design.widget.CollapsingToolbarLayout
import android.support.design.widget.Snackbar
import android.support.v4.app.FragmentTransaction
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ImageView
import android.widget.TextView


class RecipeDetailActivity : AppCompatActivity() {
    override fun onCreate(savedinstanceState: Bundle?) {
        super.onCreate(savedinstanceState)
        setContentView(R.layout.activity_recipe_detail)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        val dishId = intent.extras!!.getLong(EXTRA_DISH_ID)
        val category = intent.extras!!.getString(EXTRA_CATEGORY)
        val recipe =
            if (category == "category2") Recipe.category2[dishId.toInt()] else Recipe.category1[dishId.toInt()]
        findViewById<TextView>(R.id.dish_name).text = recipe.name
        val imageView = findViewById<ImageView>(R.id.dish_image)
        imageView.setImageDrawable(ContextCompat.getDrawable(this, recipe.imageResourceId))
        imageView.contentDescription = recipe.name
        findViewById<TextView>(R.id.dish_recipe).text = recipe.recipe
        val collapsingToolbarLayout =
            findViewById<CollapsingToolbarLayout>(R.id.collapsing_toolbar)
        collapsingToolbarLayout.title = recipe.name
        collapsingToolbarLayout.setExpandedTitleColor(resources.getColor(android.R.color.transparent))


        if (savedinstanceState == null) {
            val stoper = StoperFragment()
            val ft = supportFragmentManager.beginTransaction()
            ft.add(R.id.stoper_container, stoper)
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            ft.commit()
        }
    }

    fun onClickSend(v: View) {
        val text: CharSequence = "Przepis udostępniony"
        val duration = Snackbar.LENGTH_LONG
        val snackbar = Snackbar.make(findViewById(R.id.coordinator), text, duration)
        snackbar.setAction("OK") { snackbar.dismiss() }
        snackbar.show()
    }

    companion object {
        const val EXTRA_DISH_ID = "id"
        const val EXTRA_CATEGORY = "category"
    }
}