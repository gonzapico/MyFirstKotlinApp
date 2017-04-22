package xyz.gonzapico.myfirstkotlinapp

import android.content.Context
import android.widget.Toast

/**
 * Created by gfernandez on 22/04/17.
 */
fun Context.showToast(message: String) {
  // this = Context
  Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}