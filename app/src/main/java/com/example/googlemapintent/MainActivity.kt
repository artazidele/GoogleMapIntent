package com.example.googlemapintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.connect_to_google_maps_button)
        button.setOnClickListener {
            connectToGoogleMaps()
        }
    }
    private fun connectToGoogleMaps() {
        val gmmIntentUri =
            Uri.parse("google.navigation:q=Riga, Latvia")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)
//        val gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988")
//
//// Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
//        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
//// Make the Intent explicit by setting the Google Maps package
//        mapIntent.setPackage("com.google.android.apps.maps")
//
//// Attempt to start an activity that can handle the Intent
//        startActivity(mapIntent)

//        val gmmIntentUri = Uri.parse("geo:37.7749,-122.4194")
//        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
//        mapIntent.setPackage("com.google.android.apps.maps")
////        mapIntent.resolveActivity(packageManager)?.let {
////            startActivity(mapIntent)
////        }
//        startActivity(mapIntent)
    }
}