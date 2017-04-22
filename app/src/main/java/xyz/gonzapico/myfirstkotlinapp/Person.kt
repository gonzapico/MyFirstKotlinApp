package xyz.gonzapico.myfirstkotlinapp

/**
 * Created by gfernandez on 22/04/17.
 */
open class Person(val name: String, val age: Int)

class Developer(name: String) : Person(name, 24)

// Without constructor
class MyDeveloper(val name: String = "", val age: Int = 20) {

}

fun testClass(){
  val myDev = MyDeveloper()
  // name = "", age = 20
  val myDevTwo  = MyDeveloper("U")
  // name = "U", age = 20
  val myDevThree = MyDeveloper("U", 25)
  // name = "U", age = 25
  val myDevFour = MyDeveloper(age = 36)
  // name = "", age = 36
}