package xyz.gonzapico.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class HomeActivity : AppCompatActivity() {


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_home)

    val btnShowMessage = findViewById(R.id.btnShowMessage) as Button
    val etMessage = findViewById(R.id.etMessage) as EditText

    btnShowMessage.setOnClickListener { showToastMessage("Hello ${etMessage.text}") }

  }

  fun showToastMessage(message: String) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}
