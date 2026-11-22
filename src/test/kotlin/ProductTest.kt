package org.example
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
data class Product(val name: String, val price: Int, val discount: Int? = null)
class ProductTest {
fun getFinalPrice(product: Product): Int {
    return product.price - (product.discount ?: 0)
}
  @Test
  fun testProductPrices() {
      val phone = Product("телефон", 120, 20)
      val book = Product( "Книга", 50, null)

      assertEquals(100, getFinalPrice(phone), "Цена телефона со скидкой должна быть 100")
      assertEquals(50, getFinalPrice(book), "Цена книги без скидки должна быть 50")
  }
}