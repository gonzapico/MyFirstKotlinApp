package xyz.gonzapico.myfirstkotlinapp

/**
 * Created by gfernandez on 22/04/17.
 */
fun fetchMedia(): List<MediaItem> = (0..10).map {
  MediaItem(
      "Title $it",
      "http://lorempixel.com/200/200/sports/$it/",
      if (it % 3 == 0) MediaItem.TYPE.VIDEO
      else MediaItem.TYPE.PHOTO)
}