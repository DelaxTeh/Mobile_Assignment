package com.assignmentv1.assignment.GUI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.assignmentv1.assignment.Entity.Product
import com.assignmentv1.assignment.R
import com.assignmentv1.assignment.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    var productList = ArrayList<Product>()

    //Dummy Data
    val product1 = Product(R.drawable.baseline_home_24,"Product 1","This is product 1",100.0)
    val product2 = Product(R.drawable.baseline_add_24,"Product 2","This is product 2",200.0)
    val product3 = Product(R.drawable.baseline_login_24,"Product 3","This is product 3",300.0)
    val product4 = Product(R.drawable.baseline_arrow_back_24,"Product 4","This is product 4",300.0)
    val product5 = Product(R.drawable.baseline_arrow_back_24,"Product 5","This is product 5",500.0)
    val product6 = Product(R.drawable.baseline_arrow_back_24,"Product 6","This is product 6",500.0)


    private lateinit var binding: FragmentHomeBinding
    private val nav by lazy { findNavController() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding!!.root

        val recyclerView: RecyclerView = binding!!.rvMainProductsList
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(context,2,GridLayoutManager.VERTICAL,false)

        productList.add(product1)
        productList.add(product2)
        productList.add(product3)
        productList.add(product4)
        productList.add(product5)
        productList.add(product6)

        val adapter = ProductAdapter(productList)
        recyclerView.adapter = adapter


        return binding.root
    }


}