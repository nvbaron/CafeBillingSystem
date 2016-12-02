package service

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import java.text.DecimalFormat

class BillingServiceSpec extends FlatSpec with Matchers {
  
  val df = new DecimalFormat("0.00");
  
  "Billing Service calculate bill " should " give total price of items as zero" in {
    val itemList = Nil
    assertResult(df.format(BillingService.calculateBill(itemList)))("0.00")
  }
  
  it should " give sum of items price as 2 pounds 30 pence " in {
		val itemList = "Cola" :: "Cheese Sandwich" :: Nil
		assertResult(df.format(BillingService.calculateBill(itemList)))("2.30")
	}
  
  it should " give sum of items price as 3 pounds 30 pence " in {
		val itemList = "Cola" :: "Coffee" :: "Cheese Sandwich" :: Nil
		assertResult(df.format(BillingService.calculateBill(itemList)))("3.30")
	}
  
  it should " give sum of items price as 6 pounds 9 pence " in {
		val itemList = "Cola" :: "Coffee" :: "Cheese Sandwich" :: "Steak Sandwich" :: Nil
		assertResult(df.format(BillingService.calculateBill(itemList)))("6.90")
	}
}