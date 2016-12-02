package service

import org.scalatest.Matchers
import java.text.DecimalFormat
import org.scalatest.FlatSpec
import domain.Cola
import domain.CheeseSandwich
import domain.Coffee
import domain.SteakSandwich

class ServiceChargeSpec extends FlatSpec with Matchers {
  
  val df = new DecimalFormat("0.00");
  
  "Service Charge calculate " should " give total tax of items as zero" in {
    val itemList = Nil
    assertResult(df.format(ServiceCharge.calculate(itemList)))("0.00")
  }
  
  it should " give total tax of items as 20 pence " in {
		val itemList = Cola :: CheeseSandwich :: Nil
		assertResult(df.format(ServiceCharge.calculate(itemList)))("0.20")
	}
  
  it should " give total tax of items as 40 pence " in {
		val itemList = Cola :: Coffee :: CheeseSandwich :: CheeseSandwich :: Nil
		assertResult(df.format(ServiceCharge.calculate(itemList)))("0.40")
	}
  
  it should " give total tax of items as 1 pound 1 pence " in {
		val itemList = Cola :: Coffee :: CheeseSandwich :: SteakSandwich :: Nil
		assertResult(df.format(ServiceCharge.calculate(itemList)))("1.10")
	}
}