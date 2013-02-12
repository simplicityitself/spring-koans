package com.simplicityitself.koans.spring

import org.scalatest.BeforeAndAfter
import waypoint1.ApplicationContextKoansSolutions

class SpringKoansSolutionsSpec extends BaseKoansSpec with BeforeAndAfter {

  override def koansTitle = "Solutions: Step on the path of wisdom..."

  override def koansMethods: List[Unit] = {
    val applicationContextKoansSolutions = new ApplicationContextKoansSolutions

    applicationContextKoansSolutions.koan1CreateEmptyApplicationContext ::
      List()
  }
}
