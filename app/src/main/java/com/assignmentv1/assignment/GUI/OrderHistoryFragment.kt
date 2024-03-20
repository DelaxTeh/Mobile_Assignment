package com.assignmentv1.assignment.GUI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.assignmentv1.assignment.R

/**
 * A simple [Fragment] subclass.
 * Use the [OrderHistoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OrderHistoryFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order_history, container, false)
    }

}