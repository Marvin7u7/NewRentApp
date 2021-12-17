package com.jonareas.rentapp.views.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jonareas.rentapp.R
import com.jonareas.rentapp.adapter.HouseAdapter
import com.jonareas.rentapp.databinding.FragmentFavHousesBinding

class FavHousesFragment : Fragment() {
    private lateinit var binding: FragmentFavHousesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentFavHousesBinding.inflate(inflater, container, false)

        return binding.root
    }

}