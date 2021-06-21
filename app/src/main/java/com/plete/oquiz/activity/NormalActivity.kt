package com.plete.oquiz.activity

import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Toast
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

        var btnBg = 1

        btn1.setOnClickListener {
            if (btnBg == 1){
                btn1.setBackgroundResource(R.drawable.ic_bahasa_focussed)
                btnBg = 2
            } else{
                btn1.setBackgroundResource(R.drawable.ic_bahasa)
                btnBg = 1
            }
        }

        btnStart.setOnClickListener {
            if (btnBg == 2){
                Toast.makeText(this, "play", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "pilih mode", Toast.LENGTH_LONG).show()
            }
        }
    }
}