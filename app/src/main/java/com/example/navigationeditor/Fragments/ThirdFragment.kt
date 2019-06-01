package com.example.navigationeditor.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.example.navigationeditor.R
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_first.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.popup_action)
        }

        button_fourth.setOnClickListener {
            val nextAction = ThirdFragmentDirections.nextAction()
            Navigation.findNavController(it).navigate(nextAction)
        }

        arguments?.let {
            val safeArgs = ThirdFragmentArgs.fromBundle(it)
            textView_num.text = "Number of photos: ${safeArgs.numOfPhotos}"
        }
    }

}
