package com.mycompany.anotherone.model.entity.user

import com.mycompany.anotherone.model.entity.product.ProductItem
import java.time.LocalDateTime
import javax.persistence.*


@Entity
data class User(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,

        val firstName: String? = null,

        val lastName: String? = null,

        val nickname: String,

        @OneToMany(mappedBy = "user")
        val products: List<ProductItem> = ArrayList<ProductItem>(),

        val dateRegistration: LocalDateTime = LocalDateTime.now()
)