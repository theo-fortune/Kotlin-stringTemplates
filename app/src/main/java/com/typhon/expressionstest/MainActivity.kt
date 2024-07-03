package com.typhon.expressionstest

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.time.LocalTime

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContentView(R.layout.activity_main)

		val myText: TextView = findViewById(R.id.textView)

	  val currentTime = LocalTime.now()
		val currentHour = currentTime.hour

		val timeFormat : String = if (currentHour < 12) {
			"am"
		} else {
			"pm"
		}

		val captainAlive : Boolean = true
		val overTheBridge : Boolean = true
		val act = if (captainAlive && overTheBridge) {
			"Spare them"
		} else if (captainAlive && !overTheBridge || !captainAlive && overTheBridge) {
			"Shoot them"
		} else {
			"Pray to God"
		}

		myText.text = "Time is: ${currentHour}${timeFormat} \n ${act}"

		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}
	}
}