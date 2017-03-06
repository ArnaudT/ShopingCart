package io.github.arnaudt

/**
  * Created by arnaudtanguy on 06/03/2017.
  */
class CheckoutSystem {

  /**
    * scan take a list of products and outputs the total cost
    *
    * @param products the product list
    * @return the total cost in cents
    */
  def scan(products: Product*): PriceInCents = {
    PriceInCents(products.map(_.priceInCents.value).sum)
  }
}