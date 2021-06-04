package com.vic.ecommercecleanarchi.discount.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vic.ecommercecleanarchi.databinding.DiscountProductItemBinding
import com.vic.ecommercecleanarchi.discount.view.adapter.DiscountProductAdapter.DiscountProductViewHolder
import com.vic.ecommercecleanarchi.discount.model.DiscountProduct

class DiscountProductAdapter(private val discountProducts: MutableList<DiscountProduct> = mutableListOf()) :
    RecyclerView.Adapter<DiscountProductViewHolder>() {

    fun setList(list: List<DiscountProduct>) {
        discountProducts.clear()
        discountProducts.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscountProductViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding: DiscountProductItemBinding =
            DiscountProductItemBinding.inflate(layoutInflater, parent, false)
        return DiscountProductViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: DiscountProductViewHolder, position: Int) {
        val product: DiscountProduct = discountProducts[position]
        holder.bind(product)
    }

    override fun getItemCount() = discountProducts.size

    inner class DiscountProductViewHolder(val binding: DiscountProductItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(product: DiscountProduct) {
            val drawableResourceId: Int = binding.root.resources.getIdentifier(
                product.imageUrl, "drawable", binding.root.context.packageName
            )
            binding.discountProduct.setImageResource(drawableResourceId)
            binding.price.text = product.price
        }

    }
}