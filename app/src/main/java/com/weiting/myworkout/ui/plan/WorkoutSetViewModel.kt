package com.weiting.myworkout.ui.plan

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WorkoutSetViewModel : ViewModel() {

    private val _workoutSetDataList = MutableLiveData<List<WorkoutSetData>>()
    val workoutSetDataList: LiveData<List<WorkoutSetData>>
        get() = _workoutSetDataList

    init {
        setMockData()
    }

    private fun setMockData(){
        _workoutSetDataList.value = listOf(
            WorkoutSetData(
                setName = "Exercises",
                duration = 1000000,
                workouts = listOf(
                    Workout(
                        name = "Exercise",
                        tag = "Chest",
                        repeat = 3
                    )
                )
            ),
            WorkoutSetData(
                setName = "Exercises",
                duration = 1000000,
                workouts = listOf(
                    Workout(
                        name = "Exercise",
                        tag = "Chest",
                        repeat = 3
                    )
                )
            ),
            WorkoutSetData(
                setName = "Exercises",
                duration = 1000000,
                workouts = listOf(
                    Workout(
                        name = "Exercise",
                        tag = "Chest",
                        repeat = 3
                    )
                )
            ),
            WorkoutSetData(
                setName = "Exercises",
                duration = 1000000,
                workouts = listOf(
                    Workout(
                        name = "Exercise",
                        tag = "Chest",
                        repeat = 3
                    )
                )
            )
        )
    }

}

data class WorkoutSetData(
    val setName: String,
    val duration: Long, //milli
    val workouts: List<Workout>
)

data class Workout(
    val name: String,
    val tag: String,
    val repeat: Int
)