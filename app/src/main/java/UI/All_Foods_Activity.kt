package UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_all_foods.*
import models.MyFood
import utils.MySharedPreference
import uz.saidarabxon.akramov.foodapp.R
import uz.saidarabxon.akramov.foodapp.adapders.MyFoodAdapter

class All_Foods_Activity : AppCompatActivity() {

    lateinit var list:ArrayList<MyFood>
    private lateinit var myFoodAdapter: MyFoodAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_foods)

        MySharedPreference.init(this)
        list = MySharedPreference.list

myFoodAdapter = MyFoodAdapter(list,this)
        list_view.adapter = myFoodAdapter


        list_view.setOnItemClickListener { parent, view, position, id ->
            val intent  =Intent(this,Info_Activity::class.java)

            intent.putExtra("keyIndex",position)

            startActivity(intent)
        }



    }
}