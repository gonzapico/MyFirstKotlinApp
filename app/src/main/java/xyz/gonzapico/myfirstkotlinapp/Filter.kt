package xyz.gonzapico.myfirstkotlinapp

/**
 * Created by gfernandez on 22/04/17.
 *
 * It could contains an object
 */
sealed class Option {

  object None : Option()
  class Some(val value: Int) : Option()

}

fun testOption(option: Option) {
  when (option) {
    is Option.Some -> print("value: ${option.value}")
    is Option.None -> print("Empty option")
  }
}

sealed class Filter {
  object None : Filter()
  class ByType(val type: MediaItem.TYPE) : Filter()
}