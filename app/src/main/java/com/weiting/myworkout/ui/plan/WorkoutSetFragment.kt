package com.weiting.myworkout.ui.plan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.weiting.myworkout.databinding.FragmentWorkoutSetBinding

class WorkoutSetFragment : Fragment() {

    /*
        It's a RecyclerView and show all workout set.
        The user can filter the set by tag that created by user.
        Tags are collected from sets that storage on firebase.

        Fetch sets -> get tags -> show on screen for choice

     */


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentWorkoutSetBinding.inflate(inflater, container, false)
        val viewModel = ViewModelProvider(this).get(WorkoutSetViewModel::class.java)
        val adapter = SetAdapter()

        viewModel.workoutSetDataList.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }

        binding.rvWorkoutSets.adapter = adapter

        return binding.root
    }

}