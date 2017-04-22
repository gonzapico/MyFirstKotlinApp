package xyz.gonzapico.myfirstkotlinapp

/**
 * Created by gfernandez on 22/04/17.
 */
class Person(name: String, age: Int){
  // To change functionality in getter and/or setter

  var name = name
    get() = "Name -> $field"
    set(value){
      if (value.isNotEmpty()){
        field = value
      }
    }
  var age = age


}

fun testClass(){
  val person = Person("Anto", 33)
  val name = person.name
  person.name = "Miguel"
}