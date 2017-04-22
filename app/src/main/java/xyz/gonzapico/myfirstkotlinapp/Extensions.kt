package xyz.gonzapico.myfirstkotlinapp

import android.content.Context
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast

/**
 * Created by gfernandez on 22/04/17.
 */
fun Context.showToast(message: String) = // this = Context
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()

fun RecyclerView.ViewHolder.showToast(message: String) = this.itemView.context.showToast(message)

fun ViewGroup.inflate(@LayoutRes layoutToInflate: Int) = LayoutInflater.from(context).inflate(
    layoutToInflate, this, false)