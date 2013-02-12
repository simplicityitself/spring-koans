package com.simplicityitself.koans.spring

import org.scalatest._
import waypoint1.ApplicationContextKoans

class SpringKoansSpec extends BaseKoansSpec with BeforeAndAfter {

  override def koansTitle = "Your journey through Spring begins..."

  override def koansMethods: List[Unit] = {
	  val applicationContextKoansSolutions = new ApplicationContextKoans

  	//applicationContextKoansSolutions.koan1CreateEmptyApplicationContext ::
    	List()
  }
}
