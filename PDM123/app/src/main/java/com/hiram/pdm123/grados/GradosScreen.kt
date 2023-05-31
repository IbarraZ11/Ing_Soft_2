package com.hiram.pdm123.grados
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.KeyboardType


@Composable
fun GradosScreen(viewModel: GradosViewModel){
    var num1 by remember { mutableStateOf("") }
    val resultado by viewModel.getResult().observeAsState(0)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        TextField(
            value = num1,
            onValueChange = {num1 = it},
            label = { Text(text = "Celcius")},
            keyboardOptions =  KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
        )
        Button(onClick = { viewModel.Grados(Gradosvariable(num1.toInt())) }
        ) {
            Text(text = "Convert")
        }
        Text(text = "Result is: ${resultado}")
    }


}