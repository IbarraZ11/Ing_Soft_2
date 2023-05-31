package com.hiram.pdm123.futbol

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.material.Text

import androidx.compose.runtime.Composable


import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp
import com.hiram.pdm123.R

@Composable
fun marcadorScreen(viewModel: marcadorViewModel) {
    val localScoreResult by viewModel.getLocalScore().observeAsState(0)
    val visitScoreResult by viewModel.getVisitScore().observeAsState(0)

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.independiente), contentDescription = "Club independiente",
            modifier = Modifier
                .width(125.dp)
                .height(125.dp)
                .clickable {
                    print("Sumar local")
                    Log.d("Sumar","Local")
                    viewModel.incrementLocalScore(SoccerScoreLocalModel(localScoreResult))
                }
        )
        Spacer(modifier = Modifier.width(25.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Local")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "${localScoreResult}")
        }


        Spacer(modifier = Modifier.width(25.dp))

        Column( horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Visitante")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "${visitScoreResult}")
        }


        Spacer(modifier = Modifier.width(25.dp))

        Image(
            painter = painterResource(id = R.drawable.cuervos), contentDescription = "Club de cuervos",
            modifier = Modifier
                .width(150.dp)
                .height(150.dp)
                .clickable {
                    print("Sumar visitante")
                    Log.d("Sumar","Visitante")
                    viewModel.incrementVisitScore(SoccerScoreVisitModel(visitScoreResult))
                }
        )

    }


}