package com.typhon.expressionstest

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.time.LocalDate

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContentView(R.layout.activity_main)

		val myText: TextView = findViewById(R.id.textView)

		val currentYear = LocalDate.now().year
		val yearOfBirth = 2000
		val name = "Fortune"
		val age : Int;
		age = currentYear - yearOfBirth

		myText.text = "$name was born in $yearOfBirth and is $age years old, next year he will be " +
			"${age + 1} years old"

		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}
	}
}