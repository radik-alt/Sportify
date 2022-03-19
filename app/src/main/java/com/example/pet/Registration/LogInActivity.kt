package com.example.pet.Registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pet.R
import com.example.pet.databinding.ActivityLogInBinding
import com.example.pet.room.User.AccountRespository
import com.example.pet.room.User.DaoAccount

class LogInActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        binding = ActivityLogInBinding.inflate(layoutInflater)

        binding.clickRegister.setOnClickListener {
            var firstName = binding.firstName.editText.toString()
            var lastName = binding.lastName.editText.toString()
            var password = binding.password.text.toString()
            if (checkInput(firstName, lastName, password)){
                Toast.makeText(this, "Add user!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun checkInput(firstName:String, lastName:String, password:String): Boolean {
        if (firstName != "" && lastName != "" && password != ""){
            return true
        }
        return false
    }
}