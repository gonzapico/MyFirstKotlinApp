package xyz.gonzapico.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import kotlin.properties.Delegates

class HomeActivity : AppCompatActivity() {

  val f: (Int) -> Int = { x ->
    x * x
  }

  val recycler by lazy { find<RecyclerView>(R.id.recycler) }

  var observedNumber by Delegates.observable(0) {
    // What we are going to do every time observedNumber is changed
    p, old, new ->
    Log.d("", "old -> $old & new -> $new")
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_home)

    // Call the function find just the first time that the view is inflated. Next, it should be cached
    // id = recycler
    recycler.adapter = MediaAdapter(fetchMedia()) {
      // This is valid just if there is one input parameter
      showToast(it.title)
    }

    val viewGroup: ViewGroup = FrameLayout(this)
    val list: List<View> = viewGroup.filterViews(View::visible)

    observedNumber = 20
  }

}