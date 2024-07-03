package com.typhon.expressionstest

import android.graphics.Color
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

		val rating : Int = 5

		when(rating) {
			1 -> {
				myText.text = "Hate it! Rating = ${rating} stars"
				myText.setTextColor((Color.parseColor("#FF0000")))

			}
			2 -> {
				myText.text = "Not Good! Rating = ${rating} stars"
				myText.setTextColor((Color.parseColor("#FFA500")))

			}
			3 -> {
				myText.text = "It's Okay! Rating = ${rating} stars"
				myText.setTextColor((Color.parseColor("#FFDA00")))

			}
			4 -> {
				myText.text = "Good! Rating = ${rating} stars"
				myText.setTextColor((Color.parseColor("#97FA02")))

			}
			5 -> {
				myText.text = "Excellent! Rating = ${rating} stars"
				myText.setTextColor((Color.parseColor("#008000")))

			}
			else -> {
				myText.text = "Something missing"
				myText.setTextColor((Color.parseColor("#FF0000")))
			}
		}

		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}
	}
}