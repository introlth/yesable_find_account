package com.example.yesable

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Find_Id_Finish_Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_id_finish)

        val passwordLink = findViewById<TextView>(R.id.find_password_text)
        passwordLink.setOnClickListener{
            val intent = Intent(this, Find_Password_Main_ActIvity::class.java)
            startActivity(intent)
        }

        // 로그인 버튼 클릭 시 LoginActivity로 이동
        val loginButton: Button = findViewById(R.id.login_button)
        loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}

//비밀번호 찾기 미구현