package com.jonareas.rentapp.views.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jonareas.rentapp.R
import com.jonareas.rentapp.databinding.FragmentAddHouseBinding


class AddHouseFragment : Fragment() {

    private lateinit var binding : FragmentAddHouseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View =
        FragmentAddHouseBinding
            .inflate(inflater, container, false)
            .also {binding = it}.root
}