package uz.saidarabxon.akramov.foodapp

import UI.AddFoodActivity
import UI.All_Foods_Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

btn_menyu.setOnClickListener {
    startActivity(Intent(this,All_Foods_Activity::class.java))
}

        btn_plus.setOnClickListener {
        startActivity(Intent(this,AddFoodActivity::class.java))

        }
    }
}