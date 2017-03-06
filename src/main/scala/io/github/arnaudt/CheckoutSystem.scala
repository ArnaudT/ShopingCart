package io.github.arnaudt

/**
  * Created by arnaudtanguy on 06/03/2017.
  */
class CheckoutSystem(offerRules: OfferRule*) {

  /**
    * scan take a list of products and outputs the total cost
    *
    * @param products the product list
    * @return the total cost in cents
    */
  def scan(products: Product*): PriceInCents = {
    if (offerRules.isEmpty) {
      PriceInCents(products.map(_.priceInCents.value).sum)
    } else {
      PriceInCents(offerRules.map(_.calculatePrice(products)).map(_.value).sum)
    }
  }
}