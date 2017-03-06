package io.github.arnaudt

import org.specs2.mutable.Specification

/**
  * Created by arnaudtanguy on 06/03/2017.
  */
class PriceInCentsSpec extends Specification {

  "PriceInCents" should {
    "be formatted in pounds" in {
      PriceInCents(205).inPounds ==== 2.05d
    }

    "be formatted in string" in {
      PriceInCents(205).inPoundsFormatted ==== "£2.05"
    }
  }
}