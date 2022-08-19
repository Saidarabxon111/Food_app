package UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info.*
import models.MyFood
import utils.MySharedPreference
import uz.saidarabxon.akramov.foodapp.R

class Info_Activity : AppCompatActivity() {

    lateinit var myFood: MyFood

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

val index = intent.getIntExtra("ketIndex",0)
        MySharedPreference.init(this)


        myFood = MySharedPreference.list[index]

        tv_name.text = myFood.name
tv_mahsulot.text =myFood.kerakliMahsulot
        tv_tayyorlash.text = myFood.tayyorlashTartibi


    }
}