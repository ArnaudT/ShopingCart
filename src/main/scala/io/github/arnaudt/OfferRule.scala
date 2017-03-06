package io.github.arnaudt

/**
  * Created by arnaudtanguy on 06/03/2017.
  */
trait OfferRule {
  def calculatePrice(products: Seq[Product]): PriceInCents
}

class OneForOneOfferApple extends OfferRule {
  def calculatePrice(products: Seq[Product]): PriceInCents = ???
}

class ThreeForTwoRuleOrange extends OfferRule {
  def calculatePrice(products: Seq[Product]): PriceInCents = ???
}