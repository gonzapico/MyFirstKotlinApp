package xyz.gonzapico.myfirstkotlinapp

/**
 * Created by gfernandez on 22/04/17.
 */
abstract class Person(val name: String, val age: Int)
// Open by default
class Developer(name: String) : Person(name, 24)

// Without constructor
class MyDeveloper(val name: String = "", val age: Int = 20) {

}