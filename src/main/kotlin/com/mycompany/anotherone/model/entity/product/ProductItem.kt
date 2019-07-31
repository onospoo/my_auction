package com.mycompany.anotherone.model.entity.product

import com.mycompany.anotherone.model.entity.user.User
import javax.persistence.*

@Entity
data class ProductItem(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,

        val title: String = "",

        val description: String = "",

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id")
        val owner: User

)