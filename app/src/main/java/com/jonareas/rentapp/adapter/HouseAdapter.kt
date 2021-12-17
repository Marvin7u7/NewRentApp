package com.jonareas.rentapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jonareas.rentapp.data.model.House
import com.jonareas.rentapp.databinding.ListItemHouseBinding

class HouseAdapter(private val context: Context, private val houses: List<House>):
    RecyclerView.Adapter<HouseAdapter.HouseViewHolder>() {

    class HouseViewHolder(private val binding : ListItemHouseBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(house : House) : Unit = binding.run {
            textViewTitle.text = house.title
            textViewArea.text = house.area.toString()
            textViewPrice.text = house.price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HouseViewHolder =
        ListItemHouseBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
            .let {HouseViewHolder(it)}

    override fun onBindViewHolder(holder: HouseViewHolder, position: Int) : Unit =
        houses[position].run(holder::bind)

    override fun getItemCount() = houses.size
}