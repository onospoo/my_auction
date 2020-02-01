package com.mycompany.anotherone.service.products

import com.mycompany.anotherone.model.entity.Bet
import com.mycompany.anotherone.model.entity.Product
import com.mycompany.anotherone.model.repository.BetRepo
import com.mycompany.anotherone.model.repository.ProductRepo
import org.springframework.stereotype.Controller
import org.springframework.transaction.annotation.Transactional

@Controller
class ProductServiceImpl(
        val productRepo: ProductRepo,
        val betRepo: BetRepo
) : ProductService {

    private fun getLastBet(item: Product): Bet? =
        item.bets.maxBy { it.price }


    override fun createItem(product: Product): String {
        productRepo.save(product)

        return product.id.toString()
    }

    @Transactional
    override fun createBet(itemId: Long, price: Double): String {
        val productObj = productRepo.findById(itemId)

        return if (productObj.isPresent) {
            val product = productObj.get()

            if (product.startPrice >= price) {
                throw Exception("Ставка не должна быть меньше начальной суммы товара!")
            }

            val newBet = Bet().apply {
                this.item = product
                this.price = price
            }
            betRepo.save(newBet)
            "Ставка успешно создана ${newBet.id}"
        } else {
            throw Exception("Невозможно найти товар с таким ID!")
        }
    }

    override fun getProductList(): List<Product> =
        productRepo.findAll()

    override fun getItemCurrentBet(id: Long): Bet? {
        val item = productRepo.findById(id)
        if (item.isPresent) {
            return getLastBet(item.get())
        } else {
            throw Exception("Невозможно найти товар с таким ID!")
        }
    }
}