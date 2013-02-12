package com.simplicityitself.koans.infrastructure

import org.scalatest.FunSuite

abstract class BaseKoansSpec extends FunSuite {

  def koansMethods: List[Unit] = List()

  def koansTitle = "Your Journey Begins..."

  test(koansTitle) {
    koansMethods.foreach({ koan => koan })
  }
}
