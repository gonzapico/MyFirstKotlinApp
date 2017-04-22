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
    MediaProvider.dataAsync { items ->
      adapter.mediaItemList = items
      progress.visible = false
    }
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    menuInflater.inflate(R.menu.home_menu, menu)
    return true
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    progress.visible = true
    MediaProvider.dataAsync { items ->
      adapter.mediaItemList = when (item.itemId) {
        R.id.filter_photos -> {
          items.filter { it.type == MediaItem.TYPE.PHOTO }
        }
        R.id.filter_videos -> {
          items.filter { it.type == MediaItem.TYPE.VIDEO }
        }
        else -> items
      }
      progress.visible = false
    }

    return true
  }

}