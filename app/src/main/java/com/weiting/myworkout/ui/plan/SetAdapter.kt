package com.weiting.myworkout.ui.plan

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.weiting.myworkout.databinding.ItemSetBinding

class SetAdapter : ListAdapter<WorkoutSetData, SetAdapter.WorkoutSetViewHolder>(DiffCallback) {
    object DiffCallback : DiffUtil.ItemCallback<WorkoutSetData>() {
        override fun areItemsTheSame(oldItem: WorkoutSetData, newItem: WorkoutSetData): Boolean =
            oldItem === newItem

        override fun areContentsTheSame(oldItem: WorkoutSetData, newItem: WorkoutSetData): Boolean =
            oldItem == newItem

    }

    inner class WorkoutSetViewHolder(private val binding: ItemSetBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(workoutSetData: WorkoutSetData) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutSetViewHolder {
        return WorkoutSetViewHolder(
            ItemSetBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: WorkoutSetViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}