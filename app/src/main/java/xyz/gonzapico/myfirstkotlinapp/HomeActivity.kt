package xyz.gonzapico.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_home.*
import org.jetbrains.anko.startActivity

class HomeActivity : AppCompatActivity() {
  var adapter = MediaAdapter {
    // This is valid just if there is one input parameter
    showToast(it.title)
    // to
    // Pair (DetailActivity.EXTRA it.id)
    // infix -> extension function of an element
    // not more usual (take care of it)
    startActivity<DetailActivity>(DetailActivity.EXTRA_ITEM_ID to it.id)
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
    val filter = when (item.itemId) {
      R.id.filter_photos -> {
        Filter.ByType(MediaItem.TYPE.PHOTO)
      }
      R.id.filter_videos -> {
        Filter.ByType(MediaItem.TYPE.VIDEO)
      }
      else -> Filter.None
    }
    MediaProvider.dataAsync { items ->
      adapter.mediaItemList = when (filter) {
        is Filter.ByType -> items.filter { it.type == filter.type }
        is Filter.None -> items
      }
      progress.visible = false
    }

    return true
  }

}