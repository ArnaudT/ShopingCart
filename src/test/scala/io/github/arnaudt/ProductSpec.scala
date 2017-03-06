package io.github.arnaudt

import org.specs2.mutable.Specification

/**
  * Created by arnaudtanguy on 06/03/2017.
  */
class ProductSpec extends Specification {

  "Apple" should {
    "cost 60 p" in {
      new Apple().priceInCents.value ==== 60
    }
  }

  "Orange" should {
    "cost 25 p" in {
      new Orange().priceInCents.value ==== 25
    }
  }
}
