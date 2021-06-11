package com.plete.oquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.plete.oquiz.fragment.AkunFragment
import com.plete.oquiz.fragment.HomeFragment
import com.plete.oquiz.fragment.RankFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val home = HomeFragment()
    private val rank = RankFragment()
    private val akun = AkunFragment()

    private val fm: FragmentManager = supportFragmentManager
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setBottomNav()

    }

    private  fun setCurrentFragment(fragment: Fragment) = fm.beginTransaction().apply{
        replace(R.id.container, fragment).commit()
    }

    private fun setBottomNav(){
        setCurrentFragment(home)
        bottomNavigationView = nav_view
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.navigation_home -> setCurrentFragment(home)
                R.id.navigation_rank -> setCurrentFragment(rank)
                R.id.navigation_akun -> setCurrentFragment(akun)
//                R.id.navigation_akun -> startActivity(Intent(this, LoginActivity::class.java))
            }
            true
        }
    }
}