package com.example.implicit_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import java.net.URI

class MainActivity : AppCompatActivity() {
     lateinit var ed:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         ed=findViewById(R.id.ed)
        var btn:Button=findViewById<Button>(R.id.btn)

    }
    fun search(view: View) {
        val url=ed.text.toString()
        val input=Intent(Intent.ACTION_VIEW,Uri.parse(url))
        startActivity(input)
    }
}