package xyz.gonzapico.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_home)

    val tvWelcomeMessage = findViewById(R.id.tvWelcomeMessage) as TextView

    tvWelcomeMessage.setText(resources.getString(R.string.welcomeMessage))

    showToastMessage(tvWelcomeMessage.text.toString())
  }

  fun showToastMessage(message : String){
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
  }
}
