package com.plete.oquiz.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.plete.oquiz.R
import kotlinx.android.synthetic.main.activity_normal.*

class NormalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal)

        btnBack.setOnClickListener {
            onBackPressed()
            finish()
        }
    }
}