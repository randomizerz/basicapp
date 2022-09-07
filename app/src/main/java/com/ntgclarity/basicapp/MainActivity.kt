package com.ntgclarity.basicapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.ntgclarity.basicapp.storage.StorageActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var etUsername: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsername = findViewById(R.id.et_username)

        val btnLogin = findViewById<Button>(R.id.btn_login)
        val btnRegister = findViewById<Button>(R.id.btn_register)

        btnLogin.setOnClickListener(this)
        btnRegister.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.btn_login) {
            /*val username = etUsername?.text

            if (TextUtils.isEmpty(username)) {
                Toast.makeText(this, "Username cannot be empty!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                Toast.makeText(this, "Well done!", Toast.LENGTH_SHORT)
                    .show()
            }*/
            /*val intent = Intent(this, ItemsActivity::class.java)

            startActivity(intent)*/
            /*val intent = Intent(this, TwoFragmentsActivity::class.java)

            startActivity(intent)*/
            val intent = Intent(this, StorageActivity::class.java)

            startActivity(intent)
        } else if (view?.id == R.id.btn_register) {
            val intent = Intent(this, RegistrationActivity::class.java)

            startActivity(intent)
        }
    }
}