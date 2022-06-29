package com.example.understandingnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val check =  inflater.inflate(R.layout.fragment_home, container, false)
        changeFragment(check)
        return(check)

    }
    fun changeFragment(view: View)
    {
        val buttons = view.findViewById<Button>(R.id.button)
        buttons.setOnClickListener{
            val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()
            findNavController().navigate(action)
            Toast.makeText(context,"Wakao",Toast.LENGTH_LONG).show()

        }

    }


}