package com.hiram.pdm123.sumaapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class Suma(val num1: Int, val num2: Int)

class SumaViewModel : ViewModel(){
    private val result = MutableLiveData(0)
    fun getResult():LiveData<Int> = result

    fun sumar(suma: Suma){
        print("Sum Attempt")
        Log.d("log",suma.num1.toString())
        Log.d("log",suma.num2.toString())
        result.postValue(suma.num1 + suma.num2)
    }
}