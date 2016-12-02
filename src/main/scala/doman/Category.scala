package domain

trait Category

trait Drink extends Category

trait Food extends Category

case object ColdDrink extends Drink

case object HotDrink extends Drink

case object ColdFood extends Food

case object HotFood extends Food
