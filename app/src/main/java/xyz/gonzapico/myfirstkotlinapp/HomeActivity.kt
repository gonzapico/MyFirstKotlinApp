package xyz.gonzapico.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
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

    val textView = TextView(this).applyTwo {
      textSize = 20f
    }
  }

}


fun <T : Any> T.applyTwo(f: T.() -> Unit): T {
  this.f()
  return this
}