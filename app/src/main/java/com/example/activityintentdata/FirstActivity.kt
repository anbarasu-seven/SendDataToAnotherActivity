package com.example.activityintentdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.sendData).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            //send data directly
            intent.putExtra("name", "Survivors code")

            //send grouped data as first bundle
            var bundle1 = Bundle()
            bundle1.putString("name", "User 1")
            bundle1.putString("age", "20")
            intent.putExtras(bundle1)

            //send grouped data as second bundle
            var bundle2 = Bundle()
            bundle2.putString("name", "User 2")
            bundle2.putString("age", "22")
            intent.putExtra("bundle2", bundle2)

            val dataClass = DataClass()
            intent.putExtra("customObj", dataClass)

            startActivity(intent)
        }
    }

}