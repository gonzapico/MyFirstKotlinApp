package xyz.gonzapico.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

  companion object {
    val EXTRA_ITEM_ID = "DetailActivity:mediaItemId"
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_detail)

    val id = intent.getIntExtra(EXTRA_ITEM_ID, -1)
    val item = MediaProvider.fetchMedia().firstOrNull { it.id == id }

    // apply or let
    /*
    with(item){
      supportActionBar?.title = item?.title
      detail_thumb.loadUrl(item!!.thumbUrl)
      detail_video_indicator.visible = item?.type == MediaItem.TYPE.VIDEO
    }
    */
    item?.apply {
      supportActionBar?.title = title
      detail_thumb.loadUrl(thumbUrl)
      detail_video_indicator.visible = type == MediaItem.TYPE.VIDEO
    }
  }
}
