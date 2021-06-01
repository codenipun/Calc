package com.codenipun.scientificcalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var tvsec: TextView
    lateinit var tvpri: TextView
    lateinit var btnac: Button
    lateinit var btnc: Button
    lateinit var btnopenbrace: Button
    lateinit var btnclosebrace: Button
    lateinit var btnsin : Button
    lateinit var btncos: Button
    lateinit var btntan : Button
    lateinit var btnlog: Button
    lateinit var btnln : Button
    lateinit var btninverse: Button
    lateinit var btnroot: Button
    lateinit var btnsquare: Button
    lateinit var btnfactorial: Button
    lateinit var btndivision: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var btnmultiply: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btnsubtract: Button
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btnadd: Button
    lateinit var btnpie: Button
    lateinit var btn0: Button
    lateinit var btndot: Button
    lateinit var btnequals: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvsec = findViewById(R.id.secondaryTv)
        tvpri = findViewById(R.id.primaryTv)
        btnac = findViewById(R.id.buttonAc)
        btnc = findViewById(R.id.buttonC)
        btnopenbrace = findViewById(R.id.buttonopenbrace)
        btnclosebrace = findViewById(R.id.buttonclosebrace)
        btnsin = findViewById(R.id.buttonsin)
        btncos = findViewById(R.id.buttoncos)
        btntan = findViewById(R.id.buttontan)
        btnlog = findViewById(R.id.buttonlog)
        btnln = findViewById(R.id.buttonln)
        btninverse = findViewById(R.id.buttoninverse)
        btnroot= findViewById(R.id.buttonroot)
        btnsquare = findViewById(R.id.buttonsquare)
        btnfactorial = findViewById(R.id.buttonfactorial)
        btndivision = findViewById(R.id.buttondivision)
        btn7 = findViewById(R.id.button7)
        btn8 = findViewById(R.id.button8)
        btn9 = findViewById(R.id.button9)
        btnmultiply = findViewById(R.id.buttonmultiply)
        btn4 = findViewById(R.id.button4)
        btn5 = findViewById(R.id.button5)
        btn6 = findViewById(R.id.button6)
        btnsubtract = findViewById(R.id.buttonsubtract)
        btn1 = findViewById(R.id.button1)
        btn2 = findViewById(R.id.button2)
        btn3 = findViewById(R.id.button3)
        btnadd= findViewById(R.id.buttonadd)
        btnpie = findViewById(R.id.buttonpie)
        btn0 = findViewById(R.id.button0)
        btndot = findViewById(R.id.buttondot)
        btnequals = findViewById(R.id.buttonequals)

        btn1.setOnClickListener {
            // on below line we are appending
            // the expression to our text view.
            tvpri.text = (tvpri.text.toString() + "1")
        }
        btn2.setOnClickListener {
            // on below line we are appending
            // the expression to our text view.
            tvpri.text = (tvpri.text.toString() + "2")
        }
        btn3.setOnClickListener {
            // on below line we are appending
            // the expression to our text view.
            tvpri.text = (tvpri.text.toString() + "3")
        }
        btn4.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "4")
        }
        btn5.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "5")
        }
        btn6.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "6")
        }
        btn7.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "7")
        }
        btn8.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "8")
        }
        btn9.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "9")
        }
        btn0.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "0")
        }
        btndot.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + ".")
        }
        btnadd.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "+")
        }
        btndivision.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "/")
        }
        btnopenbrace.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "(")
        }
        btnclosebrace.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + ")")
        }
        btnpie.setOnClickListener {
            // on clicking on pi button we are adding
            // pi value as 3.142 to our current value.
            tvpri.text = (tvpri.text.toString() + "3.142")
            tvsec.text = (btnpie.text.toString())
        }
        btnsin.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "sin")
        }
        btncos.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "cos")
        }
        btntan.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "tan")
        }
        btninverse.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "^" + "(-1)")
        }
        btnln.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "ln")
        }
        btnlog.setOnClickListener {
            tvpri.text = (tvpri.text.toString() + "log")
        }
        btnsubtract.setOnClickListener {
            // on clicking on minus we are checking if
            // the user has already a minus operation on screen.
            // if minus operation is already present
            // then we will not do anything.
            val str: String = tvpri.text.toString()
            if (!str.get(index = str.length - 1).equals("-")) {
                tvpri.text = (tvpri.text.toString() + "-")
            }
        }
        btnmultiply.setOnClickListener {
            // if mul sign is not present in our
            // text view then only we are adding
            // the multiplication operator to it.
            val str: String = tvpri.text.toString()
            if (!str.get(index = str.length - 1).equals("*")) {
                tvpri.text = (tvpri.text.toString() + "*")
            }
        }

        btnroot.setOnClickListener {
            if (tvpri.text.toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                val str: String = tvpri.text.toString()
                // on below line we are calculation
                // square root of the given number.
                val r = Math.sqrt(str.toDouble())
                // on below line we are converting our double
                // to string and then setting it to text view.
                val result = r.toString()
                tvpri.setText(result)
            }
        }
        btnequals.setOnClickListener {
//            val str: String = tvpri.text.toString()
//            // on below line we are calling an evaluate
//            // method to calculate the value of expressions.
//            val result: Double = evaluate(str)
//            // on below line we are getting result
//            // and setting it to text view.
//            val r = result.toString()
//            tvpri.setText(r)
//            tvsec.text = str
        }
        btnac.setOnClickListener {
            // on clicking on ac button we are clearing
            // our primary and secondary text view.
            tvpri.setText("")
            tvsec.setText("")
        }
        btnc.setOnClickListener {
            // on clicking on c button we are clearing
            // the last character by checking the length.
            var str: String = tvpri.text.toString()
            if (!str.equals("")) {
                str = str.substring(0, str.length - 1)
                tvpri.text = str
            }
        }
        btnsquare.setOnClickListener {
            if (tvpri.text.toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                // on below line we are getting the expression and then calculating the square of the number
                val d: Double = tvpri.getText().toString().toDouble()
                // on below line we are calculating the square.
                val square = d * d
                // after calculating the square we
                // are setting it to text view.
                tvpri.setText(square.toString())
                // on below line we are setting
                // the d to secondary text view.
                tvsec.text = "$d²"
            }
        }
        btnfactorial.setOnClickListener {
            if (tvpri.text.toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                // on below line we are getting int value
                // and calculating the factorial value of the entered number.
                val value: Int = tvpri.text.toString().toInt()
                val fact: Int = factorial(value)
                tvpri.setText(fact.toString())
                tvsec.text = "$value`!"
            }
        }
    }
    fun factorial(n: Int): Int {
        // this method is use to find factorial
        return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
    }

}