package com.mycompany.anotherone.model.entity

import javax.persistence.*

@Entity(name = "product_item")
data class Product(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,

        val title: String = "",

        val description: String = "",

        val startPrice: Double = 0.0,

        @OneToMany(mappedBy = "item")
        val bets: List<Bet> = listOf()

)