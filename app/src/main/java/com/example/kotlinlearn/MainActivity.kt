package com.example.kotlinlearn

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(view: View?) {
        if (view != null) {
            when (view.id) {
                R.id.btnSum -> try {
                    ToastmyText(
                        SumofNumbers(
                            number1Edit.text.toString().toDouble(),
                            number2Edit.text.toString().toDouble()
                        ).toString()
                    )
                } catch (e: NumberFormatException) {
                    ToastmyText("Edittexts can't be empty")


                }
                R.id.btnMinus -> try {
                    ToastmyText(
                        minusofNumbers(
                            number1Edit.text.toString().toDouble(),
                            number2Edit.text.toString().toDouble()
                        ).toString()
                    )
                } catch (e: NumberFormatException) {
                    ToastmyText("Edittexts can't be empty")


                }
                R.id.btnMultiply -> try {
                    ToastmyText(
                        multiplyofNumbers(
                            number1Edit.text.toString().toDouble(),
                            number2Edit.text.toString().toDouble()
                        ).toString()
                    )
                } catch (e: NumberFormatException) {
                    ToastmyText("Edittexts can't be empty")


                }

                R.id.btnDivide -> try {
                    ToastmyText(
                        divideofNumbers(
                            number1Edit.text.toString().toDouble(),
                            number2Edit.text.toString().toDouble()
                        ).toString()
                    )
                } catch (e: NumberFormatException) {
                    ToastmyText("Edittexts can't be empty")


                }
            }
        }

    }


    private fun setOnclicks() {
        btnSum!!.setOnClickListener(this)
        btnDivide!!.setOnClickListener(this)
        btnMinus!!.setOnClickListener(this)
        btnMultiply!!.setOnClickListener(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setOnclicks()
    }

    fun SumofNumbers(a: Double, b: Double): Double {
        return a + b
    }

    fun minusofNumbers(a: Double, b: Double): Double {
        return a - b
    }

    fun divideofNumbers(a: Double, b: Double): Double {
        return a / b
    }

    fun multiplyofNumbers(a: Double, b: Double): Double {
        return a * b
    }

    fun ToastmyText(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }
}
