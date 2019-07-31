package com.mycompany.anotherone.service.products

import com.mycompany.anotherone.model.entity.product.ProductItem
import com.mycompany.anotherone.model.repository.product.ProductRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class ProductServiceImpl : ProductService {

    @Autowired
    lateinit var productRepo: ProductRepo

    override fun createItem(productItem: ProductItem): String {
        productRepo.save(productItem)

        return productItem.id.toString()
    }
}