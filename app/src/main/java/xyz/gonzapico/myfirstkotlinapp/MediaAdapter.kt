package xyz.gonzapico.myfirstkotlinapp

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

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
    val title = find<TextView>(R.id.media_title)
    val thumb = find<ImageView>(R.id.media_thumb)
    val indicator = find<ImageView>(R.id.media_video_indicator)

    fun bind(item: MediaItem) {
      title.text = item.title
      thumb.loadUrl(item.thumbUrl)
      indicator.visible = item.type == MediaItem.TYPE.VIDEO
//      indicator.visibility = if (item.type == MediaItem.TYPE.VIDEO) View.VISIBLE else View.GONE
      itemView.setOnClickListener { showToast(title.text.toString(), Toast.LENGTH_LONG) }
    }
  }
}