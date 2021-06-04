package com.vic.ecommercecleanarchi.discount.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.vic.ecommercecleanarchi.discount.model.DiscountProduct

class DiscountProductViewModel(application: Application) : AndroidViewModel(application) {

    fun getDiscountProduct(): List<DiscountProduct> {
        val products = mutableListOf<DiscountProduct>()
        products.add(DiscountProduct(1, "35€", "sac_bleu"))
        products.add(DiscountProduct(2, "35€", "sac_jaune"))
        products.add(DiscountProduct(3, "35€", "sac_vert"))
        products.add(DiscountProduct(4, "35€", "sac_bleu"))
        products.add(DiscountProduct(5, "35€", "sac_vert"))
        return products
    }
}