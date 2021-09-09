package be.digitcom.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create a dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll: Int = dice.roll()

        val diceImage: ImageView = findViewById(R.id.imageView);
        diceImage.setImageResource(R.drawable.dice_2)

        // Pop up a message to tell the dice is rolled
        // Toast.makeText(this, "Dice rolled!", Toast.LENGTH_SHORT).show()
    }
}


class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}