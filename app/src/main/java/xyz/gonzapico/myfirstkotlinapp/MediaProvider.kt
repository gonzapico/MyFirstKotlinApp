package xyz.gonzapico.myfirstkotlinapp

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * Created by gfernandez on 22/04/17.
 */
object MediaProvider {

  fun dataAsync(f: (List<MediaItem>) -> Unit) {
    doAsync {
      val data = fetchMedia()
      Thread.sleep(2000)
      uiThread {
        f(data)
      }
    }
  }

  fun fetchMedia(): List<MediaItem> = (0..10).map {
    MediaItem(
        it,
        "Title $it",
        "http://lorempixel.com/200/200/sports/$it/",
        if (it % 3 == 0) MediaItem.TYPE.VIDEO
        else MediaItem.TYPE.PHOTO)
  }
}
