package service

import domain.Item

object BillingService {
  
  def calculateBill(itemList: List[String]) : Double = {
    val items = Item(itemList)
    totalBill(items) - ServiceCharge.calculate(items)
  }
  
  def totalBill(items: List[Item]) : Double = {
    items map(_.price) sum
  }
}