package com.assignmentv1.assignment.GUI

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.assignmentv1.assignment.Entity.Product
import com.assignmentv1.assignment.R
import com.assignmentv1.assignment.databinding.ProductCardViewBinding

class ProductAdapter(private var productList:MutableList<Product>): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductViewHolder {
        val binding = ProductCardViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.productImage.setImageResource(productList[position].img)
        holder.productName.text = productList[position].title
        holder.productDesc.text = productList[position].desc
        holder.productPrice.text = productList[position].price.toString()
    }

    override fun getItemCount(): Int {
       return productList.size
    }

    class ProductViewHolder(private val binding: ProductCardViewBinding) : RecyclerView.ViewHolder(binding.root) {
        var productImage: ImageView = binding.productImage
        var productName: TextView = binding.productName
        var productDesc: TextView = binding.productDesc
        var productPrice: TextView = binding.productPrice
    }

}