package com.jonareas.rentapp.views.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.jonareas.rentapp.adapter.HouseAdapter
import com.jonareas.rentapp.databinding.ActivityLoginBinding
import com.jonareas.rentapp.databinding.FragmentSearchHouseBinding


class SearchHouseFragment : Fragment() {
    private lateinit var binding: FragmentSearchHouseBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View =
        FragmentSearchHouseBinding
            .inflate(inflater, container, false)
            .also { binding = it }.root


    private fun setUpRecyclerView() = binding.recyclerView.run {
        layoutManager = LinearLayoutManager(context)
//        adapter = HouseAdapter(context, TODO: insert some data)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()

    }

}