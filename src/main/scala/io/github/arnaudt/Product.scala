package io.github.arnaudt

/**
  * Created by arnaudtanguy on 06/03/2017.
  */
sealed trait Product {
  def priceInCents: PriceInCents
}

final object Apple extends Product {
  override def priceInCents: PriceInCents = PriceInCents(60)
}

final object Orange extends Product {
  override def priceInCents: PriceInCents = PriceInCents(25)
}