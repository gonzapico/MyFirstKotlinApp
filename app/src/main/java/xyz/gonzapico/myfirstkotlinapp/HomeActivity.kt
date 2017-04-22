package xyz.gonzapico.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
  var adapter = MediaAdapter() {
    // This is valid just if there is one input parameter
    showToast(it.title)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_home)

    recycler.adapter = adapter
    adapter.mediaItemList = fetchMedia()
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    menuInflater.inflate(R.menu.home_menu, menu)
    return true
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    val media = fetchMedia()
    when (item.itemId) {
      R.id.filter_all -> {
        media
      }
      R.id.filter_photos -> {
        media.filter { it.type == MediaItem.TYPE.PHOTO }
      }
      R.id.filter_videos -> {
        media.filter { it.type == MediaItem.TYPE.VIDEO }
      }
      else -> media
    }
    return true
  }

}