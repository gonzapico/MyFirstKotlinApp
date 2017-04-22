package xyz.gonzapico.myfirstkotlinapp

import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by gfernandez on 22/04/17.
 */
fun testWhen(view: View) {
  val int = 20

  when {
  // like if when of Java
    view is TextView -> print(
        view.text) // automatic casting and then we know it's a TextView and we have access to their methods
    System.currentTimeMillis() > 100000 -> ""
    int in 0..30 -> print("ojooo")
  }
  when (view) {
  // like instanceof
    is TextView -> print(
        view.text) // automatic casting and then we know it's a TextView and we have access to their methods
    is ViewGroup -> print("children: ${view.childCount}")
  }

  if (view is TextView) {
    // view is a TextView and without casting we can use their methods
  }

  // Any = Object in Java
  val result: Any = when (int) {
    in 1..2 -> "1"
    0, 3, 50 -> 2
    else -> throw IllegalStateException("Invalid value")
  }
  // else required with Any

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

fun testIf(view: View) {
  val int = if (view is TextView) 0 else 1
}

fun testFor(view: View) {
  // 1st way
  val list = listOf(1, 2, 3)
  for (item in list) {
    // iteration
  }

  // 2nd way
  // 1 to 10
  for (i in 1..10) {

  }
  // 1 to 9
  for (i in 1 until 9) {

  }

  /***
   * It doesn't use it
   */

}

fun testNull(view: View) {
  val mediaItem: MediaItem? = null
  // if mediaItem is not null it calls to title
  // if (mediaItem != null) mediaItem.title
  mediaItem?.title

  val mediaItemNotNull: MediaItem = mediaItem ?:
      MediaItem("Title Not Null", "ey", MediaItem.TYPE.PHOTO)

  // Very used
  val title: String = mediaItem?.title ?: "Alternative value"

  // Recommedation: no use
  // !! = 100% secure is not null
  var titleNotNull = mediaItem!!.title
}