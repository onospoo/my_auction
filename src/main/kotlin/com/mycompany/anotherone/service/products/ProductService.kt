package com.mycompany.anotherone.service.products

import com.mycompany.anotherone.model.entity.product.ProductItem


interface ProductService {

    fun createItem(productItem: ProductItem) : String
}