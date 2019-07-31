package com.mycompany.anotherone.model.repository.product

import com.mycompany.anotherone.model.entity.product.ProductItem
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ProductRepo : JpaRepository<ProductItem, Long> {
}