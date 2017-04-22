package xyz.gonzapico.myfirstkotlinapp

import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by gfernandez on 22/04/17.
 */
fun testWhen(view: View) {
  when (view) {
  // like instanceof
    is TextView -> print(
        view.text) // automatic casting and then we know it's a TextView and we have access to their methods
    is ViewGroup -> print("children: ${view.childCount}")
  }

  if (view is TextView) {
    // view is a TextView and without casting we can use their methods
  }

  val int = 10
  when (int) {
    in 1..2 -> {
      doWhatEver()
    }
    in 5..20 -> print("between 5 and 20")
    0, 3, 50 -> print("is 0.. or 30.. or 50")
    in 70..120 -> print("much bigger")
  }
}

fun doWhatEver() {

}