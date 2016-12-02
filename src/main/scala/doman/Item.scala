package domain

abstract class Item (val category: Category, val price: Double)

case object Cola extends Item(Cold, 0.50)
case object Coffee extends Item(Hot, 1.00)
case object CheeseSandwich extends Item(Cold, 2.00)
case object SteakSandwich extends Item(Hot, 4.50)

object Item {
  def apply(item: String) : Item = item match {
    case "Cola" => Cola
    case "Coffee" => Coffee
    case "Cheese Sandwich" => CheeseSandwich
    case "Steak Sandwich" => SteakSandwich
  }

  def apply(items: List[String]): List[Item] = items.map(apply)
 
}