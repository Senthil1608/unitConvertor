package com.example.unitconvertor

import android.os.Bundle
import android.widget.Toast

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material3.Button

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.unitconvertor.ui.theme.UnitConvertorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitConvertorTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    Convertor()

                }
            }
        }
    }
}
@Composable
fun Convertor()
{
    Column {
        Text("UnitConvertor")
        OutlinedTextField("",{})
        val context = LocalContext.current
        Row {
            Button(onClick ={Toast
                .makeText(context,"Thanks for Clicking",
                    Toast.LENGTH_LONG).show()} ){
                Text("Click Me")

            }
        }
        Text("Result:")
    }
}
@Preview(showBackground = true)
@Composable
fun ConvertorPreview()
{
    Convertor()
}
