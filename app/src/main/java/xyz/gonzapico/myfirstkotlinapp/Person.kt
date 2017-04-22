package xyz.gonzapico.myfirstkotlinapp

/**
 * Created by gfernandez on 22/04/17.
 */
open class Person(name:String, age:Int){
  // Properties
  val name : String = name
  val age : Int = age

}

class Developer(name: String) : Person(name, 24)