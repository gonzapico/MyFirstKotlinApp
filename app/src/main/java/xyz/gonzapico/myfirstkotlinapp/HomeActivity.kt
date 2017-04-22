package xyz.gonzapico.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView

class HomeActivity : AppCompatActivity() {


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_home)

    val recyclerView = findViewById(R.id.recycler) as RecyclerView
    recyclerView.adapter = MediaAdapter(fetchMedia())
    startActivity<HomeActivity>()
  }

}
