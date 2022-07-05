package com.gamesbracket.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val butt = findViewById<Button>(R.id.button)
        butt.setOnClickListener {
            rollDice()
        }
    }
    private fun rollDice(){
        val diceObj = Dice()
        val resultRolled = findViewById<TextView>(R.id.textView)
        resultRolled.text = diceObj.roll().toString()
    }
}
class Dice {
    fun roll(): Int {
        val range = 1..6
        return range.random()
    }
}