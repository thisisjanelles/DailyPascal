package com.example.dailypascal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var quote = QuotePicker()

    fun main(): String {
        val quotePick = QuotePicker()
        val quoteText = quotePick.getQuote()
        return quoteText
    }
}