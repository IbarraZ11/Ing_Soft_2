package com.hiram.pdm123.futbol

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class SoccerScoreLocalModel(val localscore: Int)
data class SoccerScoreVisitModel(val visitScore: Int)
class marcadorViewModel : ViewModel() {
    val currentLocalScore = MutableLiveData(0)
    fun getLocalScore(): LiveData<Int> = currentLocalScore

    val currentVisitScore = MutableLiveData(0)
    fun getVisitScore(): LiveData<Int> = currentVisitScore


    fun incrementLocalScore(localModel: SoccerScoreLocalModel){
        var incrementedScoreLocalModel = localModel.localscore+1
        currentLocalScore.postValue(incrementedScoreLocalModel)
    }
    fun incrementVisitScore(visitModel: SoccerScoreVisitModel){
        var incrementedScorevisitModel = visitModel.visitScore+1
        currentVisitScore.postValue(incrementedScorevisitModel)
    }
}