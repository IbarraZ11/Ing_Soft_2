package com.hiram.pdm123.grados


import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class Gradosvariable(val num1: Int)

class GradosViewModel : ViewModel(){
    private val resultado = MutableLiveData(0)
    fun getResult():LiveData<Int> = resultado

    fun Grados(convertir: Gradosvariable){
        print("Convert Attempt")
        Log.d("log",convertir.num1.toString())
        resultado.postValue((convertir.num1*9/5)+32 )
    }
}