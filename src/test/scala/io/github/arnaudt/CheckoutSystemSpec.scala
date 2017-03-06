package io.github.arnaudt

import org.specs2.mutable.Specification

/**
  * Created by arnaudtanguy on 06/03/2017.
  */
class CheckoutSystemSpec extends Specification {

  private val checkoutSystem = new CheckoutSystem

  "scan" should {
    "calculate and output the total cost of products" in {
      checkoutSystem.scan(Apple, Apple, Orange, Apple) ==== PriceInCents(205)
    }
  }
}