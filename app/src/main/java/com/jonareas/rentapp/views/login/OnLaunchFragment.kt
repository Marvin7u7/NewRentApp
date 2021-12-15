package com.jonareas.rentapp.views.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jonareas.rentapp.databinding.FragmentOnLaunchBinding

class OnLaunchFragment : Fragment() {

    private lateinit var binding : FragmentOnLaunchBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View
        {
            binding = FragmentOnLaunchBinding.inflate(inflater, container, false)
            return binding.root
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigateOnButtonClick()
    }

    private fun navigateOnButtonClick() = binding.apply {
        buttonSignIn.setOnClickListener {
            OnLaunchFragmentDirections.actionOnLaunchFragmentToNavigationSignIn().also{findNavController().navigate(it)}
        }

        buttonSignUp.setOnClickListener {
            OnLaunchFragmentDirections.actionOnLaunchFragmentToNavigationSignUp().also{findNavController().navigate(it)}
        }
    }

}