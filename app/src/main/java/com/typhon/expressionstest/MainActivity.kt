package com.typhon.expressionstest

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
//	private static final String TAG = "Main Activity";

	companion object {
		private const val TAG = "MainScreen"
		fun printHelloWorld() {
			Log.i(TAG, "Hello World")
		}

		fun printSun(a: Int, b: Int) {
			Log.i("Fortune", "a+b=${a+b}")
		}

		fun printName(first: String, second: String) {
			Log.i("Fortune", "Name: $first $second")
		}
	}
	override fun onCreate(savedInstanceState: Bundle?) {

		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContentView(R.layout.activity_main)
		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}
		printHelloWorld();
		printSun(10, 14)
		val num1: Int = 18;
		val num2: Int = 20;
		printSun(num1, num2);
		printName("Fortune", "Theo")
	}
}