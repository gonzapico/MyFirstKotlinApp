package xyz.gonzapico.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_home)

    val tvWelcomeMessage = findViewById(R.id.tvWelcomeMessage) as TextView
    val btnShowMessage = findViewById(R.id.btnShowMessage) as Button
    val etMessage = findViewById(R.id.etMessage) as EditText

    btnShowMessage.setOnClickListener(object  : View.OnClickListener{
      override fun onClick(v: View?) {
        showToastMessage("Message :  ${etMessage.text}")
      }

    })
//    btnShowMessage.setOnClickListener { showToastMessage("Hello ${etMessage.text}") }

//    tvWelcomeMessage.setText(resources.getString(R.string.welcomeMessage))

//    showToastMessage("Hello  ${tvWelcomeMessage.text}")
  }

  // Normal use
//  fun showToastMessage(message : String) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()

  // Assigning value directly
  fun showToastMessage(message: String) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()
  // Assign to the function the response (it doesn't exists void, you can use Unit instead)
}
