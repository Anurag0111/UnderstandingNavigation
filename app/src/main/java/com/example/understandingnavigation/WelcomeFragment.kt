package com.example.understandingnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs


class WelcomeFragment : Fragment() {
    private val args: WelcomeFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val check = inflater.inflate(R.layout.fragment_welcome, container, false)

        return (check)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val getValue = view.findViewById<TextView>(R.id.theSum)
        getValue.text = args.result.toString()

    }


}

