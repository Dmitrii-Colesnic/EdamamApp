package com.example.edamamapp

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.edamamapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewPagerAdapter by lazy(LazyThreadSafetyMode.NONE) {
        CustomFragmentAdapter(activity = this, fragmentsArray = fragments)
    }

    private val fragments = arrayListOf(
        NutritionAnalysisFragment.newInstance(),
        RecipeSearchFragment.newInstance(),
        HistoryFragment.newInstance()
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.viewPager.adapter = viewPagerAdapter

    }
}