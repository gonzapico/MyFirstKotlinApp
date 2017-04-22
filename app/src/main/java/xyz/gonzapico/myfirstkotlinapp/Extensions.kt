package xyz.gonzapico.myfirstkotlinapp

import android.support.v7.widget.RecyclerView
import android.widget.Toast

/**
 * Created by gfernandez on 22/04/17.
 */
fun RecyclerView.ViewHolder.showToast(message: String) {
  Toast.makeText(this.itemView.context, message, Toast.LENGTH_LONG).show()
}