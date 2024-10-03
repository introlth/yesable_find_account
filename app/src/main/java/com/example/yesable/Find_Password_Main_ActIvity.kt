package com.example.yesable

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class Find_Password_Main_ActIvity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val backbutton = findViewById<TextView>(R.id.back_button)
                val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
                val viewPager = findViewById<ViewPager2>(R.id.viewPager)

                backbutton.setOnClickListener {
            finish()
        }

        val fragments = listOf(
            Find_Gid_Activity(),
            Find_Cid_Activity()
        )

        val titles = listOf("일반회원", "기업회원")

        viewPager.adapter = ViewPagerAdapter(this, fragments)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = titles[position]
        }.attach()

    }
}