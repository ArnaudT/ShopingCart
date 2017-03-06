package io.github.arnaudt

import org.specs2.mutable.Specification

/**
  * Created by arnaudtanguy on 06/03/2017.
  */
class OfferRuleSpec extends Specification {
  "OneForOneOfferApple" should {
    "should be applied only for the specified type" in {
      new OneForOneOfferApple().calculatePrice(new Apple :: new Apple :: new Orange :: new Orange :: Nil) ==== PriceInCents(60)
    }

    "should be applied only for the specified type" in {
      new OneForOneOfferApple().calculatePrice(new Apple :: new Apple :: new Apple :: Nil) ==== PriceInCents(120)
    }
  }

  "ThreeForTwoRuleOrange" should {
    "should be applied only for the specified type" in {
      new ThreeForTwoRuleOrange().calculatePrice(new Orange :: new Orange :: new Orange :: new Apple :: new Apple :: Nil) ==== PriceInCents(50)
    }
    "should apply the rule" in {
      new ThreeForTwoRuleOrange().calculatePrice(new Orange :: new Orange :: new Orange :: new Orange :: new Orange :: Nil) ==== PriceInCents(50 + 50)
    }
  }
}