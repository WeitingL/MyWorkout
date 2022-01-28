package com.weiting.myworkout.ui.plan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.weiting.myworkout.databinding.FragmentWorkoutScheduleBinding

class WorkoutScheduleFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentWorkoutScheduleBinding.inflate(inflater, container, false)

        return binding.root
    }

}