package com.simplicityitself.koans.spring.infrastructure

import org.scalatest._
import com.simplicityitself.koans.infrastructure.BaseKoansSpec
import com.simplicityitself.koans.spring.waypoint1.ApplicationContextKoans

class SpringKoansSpec extends BaseKoansSpec with BeforeAndAfter {

  override def koansTitle = "Your journey through Spring begins..."

  override def koansMethods: List[Unit] = {
	  val applicationContextKoans = new ApplicationContextKoans

  	//applicationContextKoans.koan1CreateEmptyApplicationContext ::
    //applicationContextKoans.koan2CreateARootBeanDefinition ::
    	List()
  }
}
