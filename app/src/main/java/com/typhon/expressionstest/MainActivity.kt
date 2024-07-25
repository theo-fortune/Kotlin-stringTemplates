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
	companion object {
		private const val TAG = "MainScreen"
		fun orderProduct(
			giftWrap: Boolean = false, product: String, deliveryService: String =
				"Standard"
		) {
			var details: String = "";
			if (giftWrap) {
				details += "Gift wrapped"
			}

			details += product
			details += "posted by $deliveryService"
			Log.i("Fortune", details)

		}
	}

	override fun onCreate(savedInstanceState: Bundle?) {

		orderProduct(product = "Computer ")
		orderProduct(true, product = "Car ")
		orderProduct(product = "Toy Car ", deliveryService = "Next week")
		orderProduct(product = "Wooden table ", deliveryService = "FedEx")
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContentView(R.layout.activity_main)
		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}
	}
}