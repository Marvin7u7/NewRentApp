package com.jonareas.rentapp.views.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jonareas.rentapp.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    private lateinit var binding: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentSignInBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigateToForgetPasswordFragment()
    }

    private fun navigateToForgetPasswordFragment() =
        binding.textViewForgetPassword.setOnClickListener {
            SignInFragmentDirections.actionNavigationSignInToNavigationForgetPassword().also {
                findNavController().navigate(it)
            }
        }


}