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
}