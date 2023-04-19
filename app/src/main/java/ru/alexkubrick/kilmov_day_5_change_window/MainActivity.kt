package ru.alexkubrick.kilmov_day_5_change_window

import AboutActivity
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_about_activity: Button = findViewById(R.id.button_about)
        button_about_activity.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)

        }
    }
}