package com.example.understandingnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.findFragment
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class LoginFragment : Fragment() {

    private val args: LoginFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val check = inflater.inflate(R.layout.fragment_login, container, false)

        weAddIt(check)
        return (check)
    }

    private fun weAddIt(view: View) {
        val buttonAdd = view.findViewById<Button>(R.id.passButton)
        buttonAdd.setOnClickListener {

            val valueNumberA = view.findViewById<EditText>(R.id.numberA).text.toString().toInt()
            val valueNumberB = view.findViewById<EditText>(R.id.numberB).text.toString().toInt()
            val resultAB = valueNumberA + valueNumberB
            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(resultAB)
            findNavController().navigate(action)
            Toast.makeText(context, "$resultAB", Toast.LENGTH_LONG).show()

        }


    }


}