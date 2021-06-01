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
            val str: String = tvpri.text.toString()
//            // on below line we are calling an evaluate
//            // method to calculate the value of expressions.
            val result: Double = evaluate(str)
//            // on below line we are getting result
//            // and setting it to text view.
            val r = result.toString()
            tvpri.setText(r)
            tvsec.text = str
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

    fun evaluate(str: String): Double {
        return object : Any() {
            // on below line we ar creating variable
            // for tracking the position and char pos.
            var pos = -1
            var ch = 0

            // below method is for moving to next character.
            fun nextChar() {
                // on below line we are incrementing our position
                // and moving it to next position.
                ch = if (++pos < str.length) str[pos].toInt() else -1
            }

            // this method is use to check the extra space
            // present int the expression and removing it.
            fun eat(charToEat: Int): Boolean {
                while (ch == ' '.toInt()) nextChar()
                // on below line we are checking the char pos
                // if both is equal then we are returning it to true.
                if (ch == charToEat) {
                    nextChar()
                    return true
                }
                return false
            }

            // below method is to parse our
            // expression and to get the ans
            // in this we are calling a parse
            // expression method to calculate the value.
            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                return x
            }

            // in this method we will only perform addition and
            // subtraction operation on the expression.
            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    if (eat('+'.toInt())) x += parseTerm() // addition
                    else if (eat('-'.toInt())) x -= parseTerm() // subtraction
                    else return x
                }
            }

            // in below method we will perform
            // only multiplication and division operation.
            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    if (eat('*'.toInt())) x *= parseFactor() // multiplication
                    else if (eat('/'.toInt())) x /= parseFactor() // division
                    else return x
                }
            }

            // below method is use to parse the factor
            fun parseFactor(): Double {
                //on below line we are checking for addition
                // and subtraction and performing unary operations.
                if (eat('+'.toInt())) return parseFactor() // unary plus
                if (eat('-'.toInt())) return -parseFactor() // unary minus
                // creating a double variable for ans.
                var x: Double
                // on below line we are creating
                // a variable for position.
                val startPos = pos
                // on below line we are checking
                // for opening and closing parenthesis.
                if (eat('('.toInt())) { // parentheses
                    x = parseExpression()
                    eat(')'.toInt())
                } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                    // numbers
                    while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()
                    // on below line we are getting sub string from our string using start and pos.
                    x = str.substring(startPos, pos).toDouble()
                } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {
                    // on below function we are checking for the operator in our expression.
                    while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                    val func = str.substring(startPos, pos)
                    // calling a method to parse our factor.
                    x = parseFactor()
                    // on below line we are checking for square root.
                    x =
                        if (func == "sqrt") Math.sqrt(x)
                        // on below line we are checking for sin function
                        // and calculating sin function using Math class.
                        else if (func == "sin") Math.sin(
                            Math.toRadians(x)
                            // on below line we are calculating the cos value
                        ) else if (func == "cos") Math.cos(
                            Math.toRadians(x)
                            // on below line we are calculating
                            // the tan value of our expression.
                        ) else if (func == "tan")
                            Math.tan(Math.toRadians(x))
                        // on below line we are calculating
                        // log value of the expression.
                        else if (func == "log")
                            Math.log10(x)
                        // on below line we are calculating
                        // ln value of expression.
                        else if (func == "ln") Math.log(x)
                        // f we get any error then
                        // we simply return the exception.
                        else throw RuntimeException(
                            "Unknown function: $func"
                        )
                } else {
                    // if the condition not satisfy then we are returning the exception
                    throw RuntimeException("Unexpected: " + ch.toChar())
                }
                // on below line we are calculating the power of the expression.
                if (eat('^'.toInt())) x = Math.pow(x, parseFactor()) // exponentiation
                return x
            }
            // at last calling a parse for our expression.
        }.parse()
    }
}