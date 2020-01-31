package com.example.daggerandroidinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit @field:Named("HelloWorld") var helloWorld: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)
        hello_world_text.text = helloWorld
    }
}

