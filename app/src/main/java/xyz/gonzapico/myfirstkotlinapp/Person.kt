package xyz.gonzapico.myfirstkotlinapp

/**
 * Created by gfernandez on 22/04/17.
 */
class Person(var name: String, var age: Int)

fun testClass(){
  val person = Person("Anto", 33)
  val name = person.name
  person.name = "Miguel"
}