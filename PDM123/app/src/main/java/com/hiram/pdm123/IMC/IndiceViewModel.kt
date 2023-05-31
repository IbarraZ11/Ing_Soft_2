package com.hiram.pdm123.IMC

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


data class masa(val altura: Double, val peso: Double)

class IndiceViewModel : ViewModel(){
    private val result = MutableLiveData(0.0)
    private val status = MutableLiveData("")
    fun getResult(): LiveData<Double> = result
    fun getStatus(): LiveData<String> = status
    fun indice(indice: masa){
        print("Sum Attempt")
        Log.d("log",indice.altura.toString())
        Log.d("log",indice.peso.toString())
        val imc =(indice.peso/(indice.altura*indice.altura))
        result.postValue(imc)

        if(imc < 18.5){
            status.postValue("El paciente tiene bajo peso")
        }else if( imc>=18.5 && imc<=24.9){
            status.postValue("El paciente tiene un peso saludable")
        }else if( imc>=25.0 && imc<=29.9){
            status.postValue("El paciente tiene sobrepeso")
        }else if(imc>=30){
            status.postValue("El paciente tiene obesidad")
        }
    }
}