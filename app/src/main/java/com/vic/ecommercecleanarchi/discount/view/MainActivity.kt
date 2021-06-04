package com.vic.ecommercecleanarchi.discount.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.vic.ecommercecleanarchi.R.layout
import com.vic.ecommercecleanarchi.databinding.ActivityMainBinding
import com.vic.ecommercecleanarchi.discount.view.adapter.DiscountProductAdapter
import com.vic.ecommercecleanarchi.discount.viewmodel.DiscountProductViewModel

class MainActivity : AppCompatActivity(layout.activity_main) {

    private lateinit var binding: ActivityMainBinding
    private val discountProductAdapter by lazy { DiscountProductAdapter() }
    private lateinit var discountViewModel: DiscountProductViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.discountRecycler.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.discountRecycler.adapter = discountProductAdapter
        discountViewModel = ViewModelProvider(this).get(DiscountProductViewModel::class.java)
        discountProductAdapter.setList(discountViewModel.getDiscountProduct())
    }
}