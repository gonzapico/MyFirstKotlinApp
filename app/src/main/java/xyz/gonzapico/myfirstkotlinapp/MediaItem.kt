package xyz.gonzapico.myfirstkotlinapp

/**
 * Created by gfernandez on 22/04/17.
 */
data class MediaItem(val id: Int, val title: String, val thumbUrl: String, val type: TYPE) {
  enum class TYPE {PHOTO, VIDEO }
}