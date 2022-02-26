package com.skyoo.loginuipractice_20220220_new

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {

            val inputId = edtId.text.toString()
            val inputPw = edtPassword.text.toString()

            if (inputId == "admin" && inputPw == "qwer") {
                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
            }
            else if (inputId != "admin") {
                Toast.makeText(this, "아이디가 틀립니다", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "비밀번호가 잘못되었습니다.", Toast.LENGTH_SHORT).show()

            }
        }
    }
}