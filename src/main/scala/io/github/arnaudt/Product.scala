package io.github.arnaudt

/**
  * Created by arnaudtanguy on 06/03/2017.
  */
abstract class Product {
  val priceInCents: PriceInCents
}

class Apple extends Product {
  override val priceInCents: PriceInCents = PriceInCents(60)
}

class Orange extends Product {
  override val priceInCents: PriceInCents = PriceInCents(25)
}