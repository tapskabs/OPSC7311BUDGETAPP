package com.example.opsc7311_budgetapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var usernameEditText : EditText
    private lateinit var passwordEditText : EditText
    private lateinit var loginButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //bind views
        usernameEditText = findViewById(R.id.etUsername)
        passwordEditText = findViewById(R.id.etPassword)
        loginButton = findViewById(R.id.button)

        //handle login button click
        loginButton.setOnClickListener {
            //read username and values
            val usname = usernameEditText.text.toString().trim()
            val pwname = passwordEditText.text.toString().trim()

            // check if username or passowrd is empty
            if(usname.isNotEmpty() && pwname.isNotEmpty()){
                //login successful
                showDialog("Login Successful" , "Welcome $usname")

            }else{
                //login fail
                showDialog("Login Unsuccessful" , "Please enter Username and Password")
            }
        }
    }
    private fun showDialog(title : String , message: String){
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("OK", null)
            .show()

    }
}