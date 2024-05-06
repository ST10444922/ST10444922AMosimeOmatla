package com.example.st10444922ass2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




// Button to navigate to the second screen
val startButton = findViewById <Button> (R.id.startButton)
 startButton.setOnClickListener {
    val intent = Intent (this, GameActivity::class.java)

    // GameActivity: name of the second activity
// Pass the message "I am hungry" as an extra with the intent

    intent.putExtra("FEED_MESSAGE", "I am hungry")

    //This will be shown in the feedTextView
    startActivity(intent)
}
}
}
