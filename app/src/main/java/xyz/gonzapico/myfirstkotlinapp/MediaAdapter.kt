package xyz.gonzapico.myfirstkotlinapp

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.view_media_item.view.*
import kotlinx.android.synthetic.main.view_media_item.view.media_title as mediaTitle

/**
 * Created by gfernandez on 22/04/17.
 */
class MediaAdapter(
    val mediaItemList: List<MediaItem>) : RecyclerView.Adapter<MediaAdapter.MediaViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MediaViewHolder {
    return MediaViewHolder(parent.inflate(R.layout.view_media_item))
  }

  override fun onBindViewHolder(holder: MediaViewHolder, position: Int) {
    holder.bind(mediaItemList[position])
  }

  override fun getItemCount() =
      mediaItemList.size

  class MediaViewHolder(mediaView: View) : RecyclerView.ViewHolder(mediaView) {

    fun bind(item: MediaItem) = with(itemView) {
      mediaTitle.text = item.title
      media_thumb.loadUrl(item.thumbUrl)
      media_video_indicator.visible = item.type == MediaItem.TYPE.VIDEO
      setOnClickListener { showToast(item.title, Toast.LENGTH_LONG) }

      // Java
      val tv = TextView(itemView.context)
      tv.text = "a comer"
      tv.textSize = 20f

      // Kotlin
      val tv2 = TextView(itemView.context).apply {
        text = "a comer"
        textSize = 20f
      }
      // it returns itself
    }
  }
}