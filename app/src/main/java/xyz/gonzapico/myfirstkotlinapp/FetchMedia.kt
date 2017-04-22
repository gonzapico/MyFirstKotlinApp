package xyz.gonzapico.myfirstkotlinapp

/**
 * Created by gfernandez on 22/04/17.
 */
fun fetchMedia(): List<MediaItem> = listOf(
    MediaItem("One", "http://lorempixel.com/400/400/sports/1/", MediaItem.TYPE.PHOTO),
    MediaItem("Two", "http://lorempixel.com/400/400/sports/2/", MediaItem.TYPE.PHOTO),
    MediaItem("Three", "http://lorempixel.com/400/400/sports/3/", MediaItem.TYPE.PHOTO),
    MediaItem("Four", "http://lorempixel.com/400/400/sports/4/", MediaItem.TYPE.PHOTO),
    MediaItem("Five", "http://lorempixel.com/400/400/sports/5/", MediaItem.TYPE.PHOTO),
    MediaItem("Six", "http://lorempixel.com/400/400/sports/6/", MediaItem.TYPE.PHOTO),
    MediaItem("Seven", "http://lorempixel.com/400/400/sports/7/", MediaItem.TYPE.PHOTO),
    MediaItem("Eigth", "http://lorempixel.com/400/400/sports/8/", MediaItem.TYPE.PHOTO),
    MediaItem("Nine", "http://lorempixel.com/400/400/sports/9/", MediaItem.TYPE.PHOTO),
    MediaItem("Ten", "http://lorempixel.com/400/400/sports/10/", MediaItem.TYPE.VIDEO)
)