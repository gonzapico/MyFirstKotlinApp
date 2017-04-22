package xyz.gonzapico.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_home)

    // Call the function find just the first time that the view is inflated. Next, it should be cached
    // id = recycler
    val adapter = MediaAdapter() {
      // This is valid just if there is one input parameter
      showToast(it.title)
    }
    recycler.adapter = adapter
    adapter.mediaItemList = fetchMedia()
  }

}