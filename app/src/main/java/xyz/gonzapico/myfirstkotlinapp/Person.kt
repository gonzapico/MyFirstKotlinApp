package xyz.gonzapico.myfirstkotlinapp

/**
 * Created by gfernandez on 22/04/17.
 */
interface Person {
  val name: String
  val age: Int

  fun getDescription() = "Name: $name, age: $age"
}

class Developer(override val name: String, override val age: Int)
  : Person

fun testClass() {
  val dev = Developer("Anto", 32)
  dev.getDescription()
}