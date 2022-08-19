package UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_food.*
import models.MyFood
import utils.MySharedPreference
import uz.saidarabxon.akramov.foodapp.R

class AddFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_food)

        MySharedPreference.init(this)

        btn_save.setOnClickListener {
            val name = edt_name.text.toString().trim()
            val km  =  kerakli_mahsulotlar.text.toString().trim()
            val tayyorlash  =  tayyorlash_tartibi.text.toString().trim()

            if (name !="" && km != "" && tayyorlash != ""){
                val myFood =MyFood (name,km,tayyorlash)
                val list = MySharedPreference.list

                list.add(myFood)
                MySharedPreference.list = list

                Toast.makeText(this, "Saqlandi", Toast.LENGTH_SHORT).show()

                finish()
            }else{
                Toast.makeText(this, "Ma'limotlarni to'liq kiriting", Toast.LENGTH_SHORT).show()
            }
        }
    }
}