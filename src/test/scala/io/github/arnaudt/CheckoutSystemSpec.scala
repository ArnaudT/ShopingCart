package io.github.arnaudt

import org.specs2.mutable.Specification

/**
  * Created by arnaudtanguy on 06/03/2017.
  */
class CheckoutSystemSpec extends Specification {
  val apple = new Apple
  val orange = new Orange

  "scan without offer" should {
    val checkoutSystem = new CheckoutSystem()
    "calculate and output the total cost of products" in {
      checkoutSystem.scan(apple, apple, orange, apple) ==== PriceInCents(205)
    }
  }

  "scan with apple orange offers" should {
    val checkoutSystem = new CheckoutSystem(new OneForOneOfferApple, new ThreeForTwoRuleOrange)
    "count only two oranges for three and one apple for two" in {
      checkoutSystem.scan(orange, orange, orange, apple, apple) ==== PriceInCents(orange.priceInCents.value * 2 + apple.priceInCents.value)
    }
  }
}