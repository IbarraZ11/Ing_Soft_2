package com.hiram.pdm123.sumaapp
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*

import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun SumaScreen(viewModel:SumaViewModel){
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    val result by viewModel.getResult().observeAsState(0)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        TextField(
            value = num1,
            onValueChange = {num1 = it},
            label = { Text(text = "Number 1")},
            keyboardOptions =  KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
        )
        TextField(
            value = num2,
            onValueChange = {num2 = it},
            label = { Text(text = "Number 2")},
            keyboardOptions =  KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
        )

        Button(onClick = { viewModel.sumar(Suma(num1.toInt(), num2.toInt())) }
        ) {
            Text(text = "Sum")
        }
        Text(text = "Result is: ${result}")
    }


}