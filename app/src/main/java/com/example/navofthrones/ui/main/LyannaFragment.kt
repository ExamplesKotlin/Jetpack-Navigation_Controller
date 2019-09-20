package com.example.navofthrones.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navofthrones.R
import kotlinx.android.synthetic.main.lyanna_fragmen.*

class LyannaFragment : Fragment() {

    companion object {
        fun newInstance() = LyannaFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.lyanna_fragmen, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // TODO: add click listener
        button.setOnClickListener {

            view?.let { it -> Navigation.findNavController(it).navigate(R.id.jhonSnowFragment) }
        }
    }
}