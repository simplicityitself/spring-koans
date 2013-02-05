package com.simplicityitself.koans.spring

import org.scalatest._

class SpringKoansSpec extends BaseKoansSpec with BeforeAndAfter {

  override def koansTitle = "Your journey through Spring begins..."

  override def koansMethods: List[Unit] = {
    //ApplicationContextKoans.koan1CreateEmptyApplicationContext ::
      List()
  }

  override def koansSolutionMethods: List[Unit] = {
    val applicationContextKoansSolutions = new ApplicationContextKoansSolutions

    applicationContextKoansSolutions.koan1CreateEmptyApplicationContext ::
    List()
  }
}
