package com.mycompany.anotherone.controller

import com.mycompany.anotherone.model.entity.product.ProductItem
import com.mycompany.anotherone.service.products.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class AuctionControllerImpl : AuctionController {

    @Autowired
    lateinit var productService: ProductService

    override fun createItem(productItem: ProductItem): ResponseEntity<String> =
            ResponseEntity.ok(productService.createItem(productItem))
}