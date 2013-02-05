package com.simplicityitself.koans.spring

import org.scalatest.FunSuite

abstract class BaseKoansSpec extends FunSuite {

  def koansMethods: List[Unit] = List()

  def koansSolutionMethods: List[Unit] = List()

  def koansTitle = "Your Journey Begins..."

  def koansSolutionTitle = "Solutions: Step on the path of wisdom..."

  test(koansTitle) {
    koansMethods.foreach({koan => koan})
  }

  test(koansSolutionTitle) {
    koansSolutionMethods.foreach({koan => koan})
  }
}
