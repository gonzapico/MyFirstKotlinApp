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
}