package com.example.st10444922ass2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class GameActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

   val petImageView = findViewById<ImageView>(R.id.petImageView)
    val feedButton = findViewById <Button>(R.id.feedButton)
    val cleanButton = findViewById<Button>(R.id.cleanButton)
    val playButton = findViewById<Button>(R.id.playButton)

    val feedTextView = findViewById<TextView>(R.id.feedTextView)
        val playTextView =  findViewById<TextView>(R.id.playTextView)
     val cleanTextView =   findViewById<TextView>(R.id.cleanTextView)


        // Retrieve the message passed from the first screen
        val feedMessage = intent.getStringExtra("FEED_MESSAGE")

        //set the text of the TextView to the feed message
        feedTextView.text = feedMessage

        // Logic for the feed button
        feedButton.setOnClickListener{
    //change the pet's image to match feeding action icon
            petImageView.setImageResource(R.drawable.peteating)
            //replace text in bold with your picture name

            //Update the pet's status values (e.g., health; hunger, cleanliness)
            //Update the feed TextView
            feedTextView.text = getString(R.string.feed_thank_you)

            //Update the play TextView
        playTextView.text = getString(R.string.play_with_me)
        }
        //Logic for the Clean Button
        cleanButton.setOnClickListener{
            //change the pet's image image to match cleaning action icon
            petImageView.setImageResource(R.drawable.petbathing)
            //picture of your name

            //Update the pet's status values (e.g., health, hunger, cleanliness)
            // Update the clean textview
            cleanTextView.text= getString(R.string.nice_and_clean)
        }
        //Logic for the play button
        playButton.setOnClickListener{
            //change the pet's the image to match playing action icon
            petImageView.setImageResource(R.drawable.petplaying)
            //your picture name here

            // Update the the pet's status values (e.g., health, hunger, cleanliness)
            //Update the play TextView
            playTextView.text = getString(R.string.play_that_was_fun)
            //Update the clean textview
            playTextView.text = getString(R.string.play_that_was_fun)
        }


        }
}