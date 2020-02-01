package com.mycompany.anotherone.controller

import com.mycompany.anotherone.model.entity.Bet
import com.mycompany.anotherone.model.entity.Product
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/auction")
interface AuctionController {

    @PostMapping("/item/create")
    fun createItem(product: Product) : ResponseEntity<String>

    @GetMapping("/item/list")
    fun getItemList() : ResponseEntity<List<Product>>

    @GetMapping("/item/bet/current")
    fun getItemCurrentBet(
            @RequestParam(name = "ID товара")
            id: Long
    ) : ResponseEntity<Bet>

    @PostMapping("/bet/create")
    fun createBet(
            @RequestParam(name = "ID товара")
            id: Long,

            @RequestParam(name = "Цена товара")
            price: Double
    ) : ResponseEntity<String>
}