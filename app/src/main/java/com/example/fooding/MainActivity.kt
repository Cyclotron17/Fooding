package com.example.fooding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnS.setOnClickListener {
            fun tst(view: View) {
                Toast.makeText(this, "Reporting an issue....." , Toast.LENGTH_LONG).show()
            }

        }

    }

    /*fun tst(view: View) {Toast.makeText(this, "Reporting an issue....." , Toast.LENGTH_LONG).show()}*/
}