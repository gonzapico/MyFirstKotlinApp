package xyz.gonzapico.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class HomeActivity : AppCompatActivity() {


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_home)

    val tvWelcomeMessage = findViewById(R.id.tvWelcomeMessage) as TextView

    tvWelcomeMessage.setText(resources.getString(R.string.welcomeMessage))

    // Casting example
    val myInt = 20
    val myLong: Long = myInt.toLong()
  }
}
