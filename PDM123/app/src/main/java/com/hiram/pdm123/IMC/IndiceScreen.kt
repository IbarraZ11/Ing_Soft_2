package com.hiram.pdm123.IMC

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable


import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.hiram.pdm123.R


@Composable
fun IndiceScreen(viewModel: IndiceViewModel) {

    var altura by remember { mutableStateOf("") }
    var peso by remember { mutableStateOf("") }
    val result by viewModel.getResult().observeAsState(0.0)
    val status by viewModel.getStatus().observeAsState("")

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.doctor), contentDescription = "Doctor",
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
        )

        TextField(
            value = altura,
            onValueChange = { altura = it },
            label = { Text(text = "Estatura en metros:") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(50.dp))
        TextField(
            value = peso,
            onValueChange = { peso = it },
            label = { Text(text = "peso en kilogramos:") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
        )

        Button(onClick = { viewModel.indice(masa(altura.toDouble(), peso.toDouble())) }
        ) {
            Text(text = "Calcular")
        }
        Text(text = "Tu indice de masa corporal es: ${result}")
        Text(text = "${status}")
    }


}
