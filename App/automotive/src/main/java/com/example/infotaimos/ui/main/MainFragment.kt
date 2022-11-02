package com.example.infotaimos.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.infotaimos.R
import com.example.infotaimos.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        binding!!.imageButton2.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_navigation)
        }
        return binding!!.root
    }


    fun goToNavigation() {
        findNavController().navigate(R.id.action_mainFragment_to_navigation)
    }

}