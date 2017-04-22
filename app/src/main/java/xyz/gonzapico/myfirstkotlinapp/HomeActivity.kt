package xyz.gonzapico.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

  val f: (Int) -> Int = { x ->
    x * x
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_home)

    // id = recycler
    recycler.adapter = MediaAdapter(fetchMedia()) {
      // This is valid just if there is one input parameter
      showToast(it.title)
    }

    val viewGroup: ViewGroup = FrameLayout(this)
    val list: List<View> = viewGroup.filterViews { view -> view.visible }
  }

}


/*** A function that passes by parameter that is an extension function ***/
fun <T : Any> T.applyTwo(f: T.() -> Unit): T {
  this.f()
  // return itself because that's the way apply works
  return this
}

fun <T : Any> T.withTwo(obj: T, f: T.() -> Unit): T {
  obj.f()
  return obj
}

fun ViewGroup.filterViews(condition: (View) -> Boolean): List<View> {
  // Default list are inmutable
  // Inmutable list empty just created
  val list = mutableListOf<View>()
  for (i in 0 until childCount) {
    val view = getChildAt(i)
    if (condition(view)) {
      list.add(view)
    }
  }
}