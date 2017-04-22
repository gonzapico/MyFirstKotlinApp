package xyz.gonzapico.myfirstkotlinapp

/**
 * Created by gfernandez on 22/04/17.
 */
open class Person(val name:String, val age:Int)

class Developer(name: String) : Person(name, 24)

// They don't need to be inside a class
fun testFun(){
  val person = Person("Name", 20)
  person.age
}