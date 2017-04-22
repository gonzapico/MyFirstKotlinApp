package xyz.gonzapico.myfirstkotlinapp

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.view_media_item.view.*

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

    fun bind(item: MediaItem) {
      itemView.media_title.text = item.title
      itemView.media_thumb.loadUrl(item.thumbUrl)
      itemView.media_video_indicator.visible = item.type == MediaItem.TYPE.VIDEO
//      indicator.visibility = if (item.type == MediaItem.TYPE.VIDEO) View.VISIBLE else View.GONE
      itemView.setOnClickListener { showToast(item.title, Toast.LENGTH_LONG) }
    }
  }
}