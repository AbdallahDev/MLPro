package com.example.user.mlpro

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rdo_en.setOnClickListener {

            var loc = Locale("en")
            Locale.setDefault(loc)

            var con = Configuration()
            con.locale = loc
            baseContext.resources.updateConfiguration(con, baseContext.resources.displayMetrics)

            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }

        rdo_ar.setOnClickListener {
            var loc = Locale("ar")
            Locale.setDefault(loc)

            var con = Configuration()
            con.locale = loc
            baseContext.resources.updateConfiguration(con,
                    baseContext.resources.displayMetrics)

            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}
