package io.github.arnaudt

/**
  * Created by arnaudtanguy on 06/03/2017.
  */
case class PriceInCents(value: Int) {
  lazy val inPounds: Double = value / 100d
  lazy val inPoundsFormatted: String = s"£$inPounds"
}