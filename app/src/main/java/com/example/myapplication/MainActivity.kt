package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var inputText: EditText
    private lateinit var counter: TextView
    private lateinit var button: Button
    private lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputText = findViewById(R.id.input_text)
        counter = findViewById(R.id.counter)
        button = findViewById(R.id.button)
        result = findViewById(R.id.result)
    }


    fun onButtonClick(view: View) {
        val text = inputText.text.toString()
        val reversText = text.reversed()
        val resultText = "Результат: $reversText"
        val filterText = reversText.filter { it !=' ' }
        val counterChars = "Количество символов: ${filterText.count()}"
        result.text = resultText
        counter.text = counterChars

    }
}