package xyz.gonzapico.myfirstkotlinapp

import android.content.Context
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
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