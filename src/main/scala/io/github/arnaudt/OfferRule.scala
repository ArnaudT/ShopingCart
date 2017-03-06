package io.github.arnaudt

/**
  * Created by arnaudtanguy on 06/03/2017.
  */
trait OfferRule {
  def calculatePrice(products: Seq[Product]): PriceInCents
}

class OneForOneOfferApple extends OfferRule {
  def calculatePrice(products: Seq[Product]): PriceInCents = {
    val filteredProducts = products.collect { case a: Apple => a }
    if (filteredProducts.size % 2 == 0) {
      PriceInCents(filteredProducts.map(_.priceInCents.value).sum / 2)
    } else {
      val otherProducts = filteredProducts.take(1)
      PriceInCents(filteredProducts.drop(1).map(_.priceInCents.value).sum / 2 + otherProducts.map(_.priceInCents.value).sum)
    }
  }
}

class ThreeForTwoRuleOrange extends OfferRule {
  def calculatePrice(products: Seq[Product]): PriceInCents = {
    val filteredProducts = products.collect { case a: Orange => a }
    val modulo = filteredProducts.size % 3
    if (modulo == 0) {
      PriceInCents(filteredProducts.map(_.priceInCents.value).sum * 2 / 3)
    } else {
      val otherProducts = filteredProducts.take(modulo)
      PriceInCents(filteredProducts.drop(modulo).map(_.priceInCents.value).sum * 2 / 3 + otherProducts.map(_.priceInCents.value).sum)
    }
  }
}