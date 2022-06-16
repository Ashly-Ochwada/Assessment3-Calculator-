package com.naburi.assessment3calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNum1: TextInputLayout
    lateinit var etNum1: TextInputEditText
    lateinit var tilNum2: TextInputLayout
    lateinit var etNum2: TextInputEditText
    lateinit var btnAddition: Button
    lateinit var btnSubtraction: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNum1=findViewById(R.id.tilNum1)
        etNum1=findViewById(R.id.etNum1)
        tilNum2 = findViewById(R.id.tilNum2)
        etNum2 = findViewById(R.id.etNum2)
        btnAddition = findViewById(R.id.btnAddition)
        btnSubtraction = findViewById(R.id.btnSubtraction)
        btnModulus = findViewById(R.id.btnModulus)
        btnDivision =findViewById(R.id.btnDivision)
        tvResult= findViewById(R.id.tvResult)
        validate()

        btnAddition.setOnClickListener {
            var nums1 = etNum1.text.toString().toDouble()
            var nums2 = etNum2.text.toString().toDouble()

            add(nums1,nums2)
        }
        btnSubtraction.setOnClickListener {
            var nums1 = etNum1.text.toString().toDouble()
            var nums2 = etNum2.text.toString().toDouble()

            subtract(nums1,nums2)
        }
        btnModulus.setOnClickListener {
            var nums1 = etNum1.text.toString().toDouble()
            var nums2 = etNum2.text.toString().toDouble()

            module(nums1,nums2)
        }
        btnDivision.setOnClickListener {
            var nums1 = etNum1.text.toString().toDouble()
            var nums2 = etNum2.text.toString().toDouble()

            divide(nums1, nums2)
        }

    }
    fun add(nums1:Double, nums2:Double){

         var num = nums1+nums2
         tvResult.text = num.toString()
 }
    fun subtract(nums1: Double,nums2: Double){
        var num = nums1-nums2
        tvResult.text = num.toString()
    }
    fun module (nums1: Double,nums2: Double){
        var num = nums1%nums2
        tvResult.text = num.toString()
    }
    fun divide (nums1: Double,nums2: Double){
        var num = nums1/nums2
        tvResult.text = num.toString()
    }
    fun validate(){
        var error = false
        tilNum1.error = null
        tilNum2.error = null
        var nums1 = etNum1.text.toString()
        if (nums1.isBlank()){
            tilNum2.error = "First number is required"
            error = true
        }
        var nums2 = etNum2.text.toString()
        if(nums2.isBlank()){
            tilNum2.error = "Second number is required"
            error = true

        }
        if (!error){

        }
    }
}