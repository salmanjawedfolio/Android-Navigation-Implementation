package com.sjawed.androidnavigationdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnLogin.setOnClickListener {
            if (etUserName.text.isNotEmpty() && etPassword.text.isNotEmpty()) {
                val userName = etUserName.text.toString()
                val loginToHomeAction = LoginFragmentDirections.actionLoginFragmentToHomeFragment(userName)
                findNavController().navigate(loginToHomeAction)
            } else {
                Toast.makeText(activity, "Please enter values", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
