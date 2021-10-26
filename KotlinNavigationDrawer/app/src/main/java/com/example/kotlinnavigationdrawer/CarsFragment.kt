package com.example.kotlinnavigationdrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlinnavigationdrawer.databinding.FragmentCarsBinding
import com.example.kotlinnavigationdrawer.databinding.FragmentUsersBinding


class CarsFragment : Fragment(R.layout.fragment_cars) {
    private lateinit var binding : FragmentCarsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCarsBinding.bind(view)

    }
}