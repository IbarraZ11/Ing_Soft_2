package com.hiram.pdm123.agua


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


data class WaterConsumeModel(val currentWaterAmount : Double, val waterAmount : Double)
class WaterConsumeViewModel : ViewModel() {
    val sumando = MutableLiveData(0.0)
    fun incrementWater(): LiveData<Double> = sumando

    fun incrementWaterAmount (model : WaterConsumeModel){
        val result = model.waterAmount + model.currentWaterAmount
        sumando.postValue(result)
    }

    fun restablecer(model: WaterConsumeModel){
        sumando.postValue(0.0)
    }





}