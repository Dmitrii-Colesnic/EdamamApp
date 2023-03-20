package com.example.edamamapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.edamamapp.databinding.FragmentRecipeSearchBinding

class RecipeSearchFragment : Fragment() {

    private lateinit var binding: FragmentRecipeSearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecipeSearchBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = RecipeSearchFragment()
    }
}