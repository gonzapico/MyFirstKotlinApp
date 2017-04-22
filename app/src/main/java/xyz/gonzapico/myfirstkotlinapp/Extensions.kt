package xyz.gonzapico.myfirstkotlinapp

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.annotation.IdRes
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

/**
 * Created by gfernandez on 22/04/17.
 */
fun Context.showToast(message: String, length: Int = Toast.LENGTH_LONG) = // this = Context
    Toast.makeText(this, message, length).show()

fun RecyclerView.ViewHolder.showToast(message: String,
    length: Int = Toast.LENGTH_SHORT) = this.itemView.context.showToast(message, length)

fun ViewGroup.inflate(@LayoutRes layoutToInflate: Int,
    attachToRoot: Boolean = false) = LayoutInflater.from(context).inflate(
    layoutToInflate, this, attachToRoot)

fun ImageView.loadUrl(urlToLoad: String) = Picasso.with(context).load(urlToLoad).into(this)

/***
 * Two ways to set the visibility
 */
fun View.visible(visible: Boolean) {
  visibility = if (visible) View.VISIBLE else View.GONE
}

var View.visible: Boolean
  get() = visibility == View.VISIBLE
  set(value) {
    visibility = if (value) View.VISIBLE else View.GONE
  }

/***
 * To what activity we want to navigate
 */
inline fun <reified T : Activity> Context.startActivity() {
  startActivity(Intent(this, T::class.java))
}

inline fun <reified V : View> View.find(@IdRes resId: Int): V = findViewById(resId) as V

inline fun <reified V : View> Activity.find(@IdRes resId: Int): V = findViewById(resId) as V

inline fun <reified V : View> RecyclerView.ViewHolder.find(@IdRes resId: Int): V = itemView.find<V>(
    resId)