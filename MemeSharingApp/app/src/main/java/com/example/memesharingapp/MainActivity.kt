package com.example.memesharingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import java.lang.System.load
import android.widget.ImageView as ImageView1



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loadmeme()
    }
    fun loadmeme(){
        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url = "https://i.redd.it/ja2fvqw8kin71.jpg"

// Request a string response from the provided URL.
        val stringRequest = JsonObjectRequest(
            Request.Method.GET, url,null,
            Response.Listener{ response ->
                val url=response.getString("url")


            val imageView=findViewById<View>(R.id.imageView2)

                Glide.with(this).load(url).into(imageView as android.widget.ImageView)
            },
            Response.ErrorListener {
                Toast.makeText( this,"No Bro", Toast.LENGTH_SHORT).show()
            })

// Add the request to the RequestQueue.
        queue.add(stringRequest)

    }
    fun sharememe(view: View) {

    }
    fun nextmeme(view: View) {

    }

}