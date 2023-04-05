package com.example.simplecalculatorapp_bett

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txt_display_answer:TextView
    private lateinit var edtFirst:EditText
    private lateinit var edtSecond:EditText
    private lateinit var addbutton:Button
    private lateinit var multiplybutton:Button
    private lateinit var dividebutton:Button
    private lateinit var subtractbutton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_display_answer = findViewById(R.id.txtanswer)
        edtFirst = findViewById(R.id.edtfirstnumber)
        edtSecond = findViewById(R.id.edtsecondnumber)
        addbutton = findViewById(R.id.btnadd)
        multiplybutton = findViewById(R.id.btnmultiply)
        dividebutton = findViewById(R.id.btnmultiply)
        subtractbutton = findViewById(R.id.btnsubtract)

        addbutton.setOnClickListener {

            var first_num = edtFirst.text.toString().trim()
            var second_num = edtSecond.text.toString().trim()

            //user validation
            if (first_num.isEmpty() || second_num.isEmpty()){
                Toast.makeText(this, "PLEASE ENTER A NUMBER ", Toast.LENGTH_SHORT).show()
            }
            else {
                var answer = first_num.toDouble() + second_num.toDouble()
                txt_display_answer.text = answer.toString()

               // Toast.makeText(this, "Trying to add two numbers", Toast.LENGTH_SHORT).show()

            }
            //Toast.makeText(this, "Trying to run", Toast.LENGTH_SHORT).show()
        }

        multiplybutton.setOnClickListener {
            var first_value = edtFirst.text.toString().trim()
            var second_value = edtSecond.text.toString().trim()

            if (first_value.isEmpty() || second_value.isEmpty()){
                Toast.makeText(this, "PLEASE ENTER A NUMBER", Toast.LENGTH_SHORT).show()
            }
            else {
                var ans = first_value.toDouble() * second_value.toDouble()
                txt_display_answer.text = ans.toString()
            }

        }

        dividebutton.setOnClickListener {
            var first = edtFirst.text.toString().trim()
            var second = edtSecond.text.toString().trim()

            if (first.isEmpty() || second.isEmpty()){
                Toast.makeText(this, "PLEASE ENTER A NUMBER", Toast.LENGTH_SHORT).show()
            }
            else{
                var answ = first.toDouble() / second.toDouble()
                txt_display_answer.text = answ.toString()
            }
        }

        subtractbutton.setOnClickListener {
            var first_number = edtFirst.text.toString().trim()
            var second_number = edtSecond.text.toString().trim()

            if (first_number.isEmpty() || second_number.isEmpty()){
                Toast.makeText(this, "PLEASE ENTER A NUMBER", Toast.LENGTH_SHORT).show()
            }
            else{
                var answer = first_number.toDouble() - second_number.toDouble()
                txt_display_answer.text = answer.toString()
            }
        }
    }
}