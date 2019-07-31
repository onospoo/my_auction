package com.mycompany.anotherone.controller

import com.mycompany.anotherone.model.entity.product.ProductItem
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/auction")
interface AuctionController {

    @PostMapping("/create")
    fun createItem(productItem: ProductItem) : ResponseEntity<String>
}