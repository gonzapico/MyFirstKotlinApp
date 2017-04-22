package xyz.gonzapico.myfirstkotlinapp

/**
 * Created by gfernandez on 22/04/17.
 */
open class Person(name:String, age:Int){
  // Properties
  val name : String
  val age : Int

  // Executing when creating the class
  init {
    this.name = name
    this.age = age
  }
}

class Developer(name: String) : Person(name, 24)