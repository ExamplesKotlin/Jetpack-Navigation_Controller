package com.example.navofthrones.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navofthrones.R
import kotlinx.android.synthetic.main.lyanna_fragmen.*

class RhaegarFragment : Fragment() {

    companion object {
        fun newInstance() = RhaegarFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.rhaegar_fragmen, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // TODO: add click listener
        button.setOnClickListener {
            view?.let { it ->
                val action = RhaegarFragmentDirections.actionRhaegarFragmentToJhonSnowFragment()
                action.setWhoami(getString(R.string.prince))
                Navigation.findNavController(it).navigate(action) }
        }
    }
}