package com.jonareas.rentapp.views.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jonareas.rentapp.R

class OnLaunchFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View
        {
            return inflater.inflate(R.layout.fragment_on_launch,  container, false)
        }

    //TODO: Handle Navigation


}