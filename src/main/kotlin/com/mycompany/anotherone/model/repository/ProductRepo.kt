package com.mycompany.anotherone.model.repository

import com.mycompany.anotherone.model.entity.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ProductRepo : JpaRepository<Product, Long> {
}