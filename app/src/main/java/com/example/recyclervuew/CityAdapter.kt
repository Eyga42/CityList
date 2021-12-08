package com.example.recyclervuew

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclervuew.databinding.CityItemBinding

class CityAdapter:RecyclerView.Adapter<CityAdapter.CytyHolder>() {

    class CytyHolder(item: View):RecyclerView.ViewHolder(item) {
        val binding = CityItemBinding.bind(item)
        fun bind(plant: City) = with(binding) {
            im.setImageResource(plant.imageId)
            tvTitle.text = plant.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CytyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.city_item, parent, false)
        return CytyHolder(view)
    }

    override fun onBindViewHolder(holder: CytyHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}