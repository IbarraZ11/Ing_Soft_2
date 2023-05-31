package com.hiram.pdm123.agua

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.hiram.pdm123.R


@Composable
fun WaterConsumeScreen(viewModel: WaterConsumeViewModel) {
    val totalWaterResult by viewModel.incrementWater().observeAsState(0.0)


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        Text(text = "Cuanta agua tomo?")
        Spacer(modifier = Modifier.width(50.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.un_litro), contentDescription = "Litro de agua",
                modifier = Modifier
                    .width(125.dp)
                    .height(125.dp)
                    .clickable {
                        print("Sumando litro")
                        Log.d("Sumar", "Litro")
                        viewModel.incrementWaterAmount(WaterConsumeModel(currentWaterAmount = totalWaterResult.toDouble(),1.0))

                    }
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = " 1L")
        }
        Spacer(modifier = Modifier.width(50.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.quinientos), contentDescription = "Medio litro de agua",
                modifier = Modifier
                    .width(125.dp)
                    .height(125.dp)
                    .clickable {
                        print("Sumar medio")
                        Log.d("Sumar", "medio")
                     viewModel.incrementWaterAmount(WaterConsumeModel(currentWaterAmount = totalWaterResult.toDouble(),0.5))
                    }
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "500 ml")
        }
        Spacer(modifier = Modifier.width(50.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.vasoagua), contentDescription = "Un cuarto de litro",
                modifier = Modifier
                    .width(125.dp)
                    .height(125.dp)
                    .clickable {
                        print("Sumar cuarto")
                        Log.d("Sumar", "cuarto")
                        viewModel.incrementWaterAmount(WaterConsumeModel(currentWaterAmount = totalWaterResult.toDouble(),0.255))
                    }
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "255 ml")
        }

        Spacer(modifier = Modifier.width(50.dp))

        Text(text = "Total de agua consumida: ${totalWaterResult}   L")
        Button(onClick = { viewModel.restablecer(WaterConsumeModel(currentWaterAmount = totalWaterResult.toDouble(),0.0))}
        ) {
            Text(text = "Restablecer")
        }



    }


}