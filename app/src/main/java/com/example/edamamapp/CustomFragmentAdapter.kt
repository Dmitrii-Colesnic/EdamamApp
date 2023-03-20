package com.example.edamamapp

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class CustomFragmentAdapter(activity: AppCompatActivity, private val fragmentsArray: ArrayList<Fragment>) :
    FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return fragmentsArray.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentsArray[position]
    }
}