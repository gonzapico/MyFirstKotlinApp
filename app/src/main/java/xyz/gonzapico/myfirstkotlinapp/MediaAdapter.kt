package xyz.gonzapico.myfirstkotlinapp

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_media_item.view.*
import kotlin.properties.Delegates
import kotlinx.android.synthetic.main.view_media_item.view.media_title as mediaTitle

/**
 * Created by gfernandez on 22/04/17.
 */
typealias Listener = (MediaItem) -> Unit

class MediaAdapter(
    val listener: Listener) : RecyclerView.Adapter<MediaAdapter.MediaViewHolder>() {

  var mediaItemList: List<MediaItem> by Delegates.observable(emptyList()) { _, _, _ ->
    notifyDataSetChanged()
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MediaViewHolder {
    return MediaViewHolder(parent.inflate(R.layout.view_media_item))
  }

  override fun onBindViewHolder(holder: MediaViewHolder, position: Int) {
    holder.bind(mediaItemList[position])
    holder.itemView.setOnClickListener {
      listener(mediaItemList[position])
//      listener.invoke(mediaItemList[position])
    }
  }

  override fun getItemCount() =
      mediaItemList.size

  class MediaViewHolder(mediaView: View) : RecyclerView.ViewHolder(mediaView) {

    fun bind(item: MediaItem) = with(itemView) {
      mediaTitle.text = item.title
      media_thumb.loadUrl(item.thumbUrl)
      media_video_indicator.visible = item.type == MediaItem.TYPE.VIDEO
    }
  }
}