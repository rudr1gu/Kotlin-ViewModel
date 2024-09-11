package com.example.viewmodel.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue



@Composable
fun MainGui (mainGui_ViewModel: MainGui_ViewModel, modifier: Modifier = Modifier){
    val contadorValueState: Int by mainGui_ViewModel.contador.observeAsState(0)

    Scaffold {
        padding ->
        Column{
            Text(text = "x-x-x-x-x-x-x-x-x-x-x-x-x-xx-x-x-x-x-x-x-x-x-x-x-x-x")

            Text(text = "x-x-x-x-x-x-x-x-x-x-x-x-x-xx-x-x-x-x-x-x-x-x-x-x-x-x")
            
            TextField(value = contadorValueState.toString(),
                onValueChange = { })

            Button(onClick = { mainGui_ViewModel.incrementarContador() }) {
                Text(text = contadorValueState.toString())

            }
        }
    }

}