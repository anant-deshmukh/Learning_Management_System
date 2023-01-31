package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.log
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // finding the edit text
        val btn_reg = findViewById(R.id.btn_reg) as Button
        val btn_log = findViewById(R.id.btn_log) as Button
        //val bck = findViewById(R.id.btn_back) as Button


        btn_reg.setOnClickListener {

            // finding tne text view
            val Name = findViewById<EditText>(R.id.name)
            val name = Name.text.toString()

            val Icode = findViewById<EditText>(R.id.icode)
            val uid = Icode.text.toString()

            val Email = findViewById<EditText>(R.id.email)
            val email = Email.text.toString()

            val MobNo = findViewById<EditText>(R.id.mobno)
            val mobno = MobNo.text

            val Pass = findViewById<EditText>(R.id.pass)
            val pass = Pass.text.toString()

            val ConPass = findViewById<EditText>(R.id.conpass)
            val conpass = ConPass.text.toString()

            if (name.isBlank() || uid.isBlank() || pass.isBlank() || mobno.isBlank() || email.isBlank()) {
                Toast.makeText(this, "Please insert all the datail", Toast.LENGTH_SHORT).show()
            } else if (pass != conpass) {
                Toast.makeText(
                    this,
                    "Password and Confirm Password do not match",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(this, "Login Successfully", Toast.LENGTH_SHORT).show()
            }
        }


        btn_log.setOnClickListener {
            //Toast.makeText(this@MainActivity, "Wait for that feature", Toast.LENGTH_SHORT).show()


//            Intent intent = new Intent(this, Login.class)
//            startActivity(intent)
//            finish()

//            val intent = Intent(this, Login::class.java)
//            startActivity(intent)

            setContentView(R.layout.activity_login)

            val bck = findViewById(R.id.btn_back) as Button
            val log = findViewById(R.id.btn_log1) as Button

//            if (bck.isPressed()){
//               // setContentView(R.layout.activity_register)
//            }
//            else{
//                setContentView(R.layout.activity_register)
//            }

//                @Override
//            fun onClick(view: View) {
//                //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//                when (view.id) {
//                    bck ->
//                        Toast.makeText(this,"button 2 clicked", Toast.LENGTH_SHORT).show()//single line code
//                    log ->{//multiline code
//                        val myToast = Toast.makeText(this,"button 4 clicked", Toast.LENGTH_SHORT)
//                        myToast.show()
//                    }
//                }
//            }


            bck.setOnClickListener {

                setContentView(R.layout.activity_register)
            }

            log.setOnClickListener {

                val icode = findViewById<EditText>(R.id.Idcode)
                val id = icode.text.toString()

                val pass = findViewById<EditText>(R.id.pass1)
                val ps = pass.text.toString()


                if (id.isBlank() || ps.isBlank()) {
                    Toast.makeText(this, "Please insert all the datail", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Login Successfull", Toast.LENGTH_SHORT).show()
                }
            }


            /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button = findViewById<Button>(R.id.btn_log)
        button.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }*/
        }
    }
}
