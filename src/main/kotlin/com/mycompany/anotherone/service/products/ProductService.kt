package com.mycompany.anotherone.service.products

import com.mycompany.anotherone.model.entity.Bet
import com.mycompany.anotherone.model.entity.Product


interface ProductService {

    fun createItem(product: Product) : String

    fun createBet(itemId: Long, price: Double): String

    fun getProductList(): List<Product>

    fun getItemCurrentBet(id: Long): Bet?
}