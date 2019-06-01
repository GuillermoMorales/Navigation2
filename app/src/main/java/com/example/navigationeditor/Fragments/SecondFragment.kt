package com.example.navigationeditor.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.example.navigationeditor.R
import kotlinx.android.synthetic.main.fragment_second.*
import java.util.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_third.setOnClickListener {
            val random = Random()

            val nextAction = SecondFragmentDirections.nextAction()
            nextAction.setNumOfPhotos(random.nextInt(100))

            Navigation.findNavController(it).navigate(nextAction)
        }
    }

}
