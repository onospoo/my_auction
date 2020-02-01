package com.mycompany.anotherone.model.entity

import java.time.Instant
import javax.persistence.*

@Entity
data class Bet(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long= 0,

        @ManyToOne
        @JoinColumn(name="product_item_id")
        var item: Product? = null,

        var price: Double = 0.0,

        var startDate: Instant = Instant.now()
)