package com.gamesbracket.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

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
        val diceImage = findViewById<ImageView>(R.id.imageView)
        when (diceObj.roll()) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            else -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}
class Dice {
    fun roll(): Int {
        val range = 1..6
        return range.random()
    }
}