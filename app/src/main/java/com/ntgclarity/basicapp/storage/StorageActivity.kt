package com.ntgclarity.basicapp.storage

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.ntgclarity.basicapp.R

class StorageActivity : AppCompatActivity() {
    var database: DataBasic? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_storage)

        val etName = findViewById<EditText>(R.id.et_name)
        val etEmail = findViewById<EditText>(R.id.et_email)

        val btnInsert = findViewById<Button>(R.id.btn_insert)
        val btnShow = findViewById<Button>(R.id.btn_show)

        btnInsert.setOnClickListener {
            val user = User(
                name = etName.text.toString(),
                email = etEmail.text.toString()
            )

            database?.getUserDao()?.insert(user)
        }

        btnShow.setOnClickListener {
            val users = database?.getUserDao()?.getUsers()

            Log.i("users", users.toString())
        }

        database = Room.databaseBuilder(this, DataBasic::class.java, "basic.db")
            .allowMainThreadQueries()
            .build()
    }
}