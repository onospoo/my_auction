package com.mycompany.anotherone.controller

import com.mycompany.anotherone.model.entity.Bet
import com.mycompany.anotherone.model.entity.Product
import com.mycompany.anotherone.service.products.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class AuctionControllerImpl(val productService: ProductService) : AuctionController {


    override fun createItem(product: Product): ResponseEntity<String> =
            ResponseEntity.ok(productService.createItem(product))

    override fun getItemList(): ResponseEntity<List<Product>> =
            ResponseEntity.ok(productService.getProductList())

    override fun createBet(id: Long, price: Double): ResponseEntity<String> =
            ResponseEntity.ok(productService.createBet(id, price))

    override fun getItemCurrentBet(id: Long): ResponseEntity<Bet> =
            ResponseEntity.ok(productService.getItemCurrentBet(id) ?: throw Exception("Ставок нет"))
}