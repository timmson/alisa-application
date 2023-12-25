package ru.timmson.android.alisa

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.View
import android.view.WindowInsets
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import ru.timmson.android.alisa.databinding.ActivityFullscreen4Binding

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class Fullscreen4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityFullscreen4Binding
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFullscreen4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        findViewById<ImageView>(R.id.imageView4).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

}