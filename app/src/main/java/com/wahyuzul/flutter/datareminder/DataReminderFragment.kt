package com.wahyuzul.flutter.datareminder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wahyuzul.flutter.R
import com.wahyuzul.flutter.databinding.FragmentDataReminderBinding

class DataReminderFragment : Fragment() {

    private var _binding: FragmentDataReminderBinding? = null
    private val binding get() = _binding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_data_reminder, container, false)


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}