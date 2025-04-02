// Title: Meal Suggestion App MainActivity
// Author: Nikyle Mazeau
// Date: 31 March 2025
// Version: 1.0
// Avaliable: https://developer.android.com/reference/android/app/Activity
// Additional Reference: https://developer.android.com/refernce/android/widget/Button

package vcmsa.ci.foodapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeInput: EditText = findViewById(R.id.timeinput)
        val suggestButton: Button = findViewById(R.id.suggestButton)
        val resultText: TextView = findViewById(R.id.resultText)
        val resetButton: Button = findViewById(R.id.resetButton)

        suggestButton.setOnClickListener {
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()

            val timeOfDay = timeInput.text.toString().trim()
            if (timeOfDay.isEmpty()) {
                resultText.text = "Please fill in all fields correctly."
            } else if (timeOfDay.equals("morning", ignoreCase = true)) {
                resultText.text = "Have pancakes and syrup for breakfast"
            } else if (timeOfDay.equals("afternoon", ignoreCase = true)) {
                resultText.text = "Have a chicken sandwich for lunch"
            } else if (timeOfDay.equals("evening", ignoreCase = true)) {
                resultText.text = "Have grilled steak for dinner"
            } else {
                resultText.text = "Invalid time of day. Please enter morning, afternoon, or evening."
            }
        }

        // Title: Kotlin if ... Else
        // Author: w3schools
        // Date: 31 March 2025
        // Version: 1.0
        // Avaliable: https://www.w3schools.com/kotlin/kotlin_conditions.php0

        resetButton.setOnClickListener {
            Toast.makeText(this, "Reset Clicked", Toast.LENGTH_SHORT).show()
            timeInput.text.clear()
            resultText.text = "Your Meal"
        }
    }
}



