package xyz.gonzapico.myfirstkotlinapp

/**
 * Created by gfernandez on 22/04/17.
 */
open class Person(val name:String, val age:Int)

class Developer(name: String) : Person(name, 24)

// Without constructor
class MyDeveloper{
  val name : String
  val age : Int
  constructor(name: String){
    this.name = name
    this.age = 20
  }
  constructor(age: Int){
    this.name = "U"
    this.age = age
  }

}