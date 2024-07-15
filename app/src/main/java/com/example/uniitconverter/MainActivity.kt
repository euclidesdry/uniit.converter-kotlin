package com.example.uniitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.uniitconverter.ui.theme.UniitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UniitConverterTheme {
                UnitConverter()
            }
        }
    }
}

@Composable
fun UnitConverter() {
    Column {
        Text("Unit Converter")
        OutlinedTextField(value = "", onValueChange = {})
        
        Row {
            Box {
                Button(onClick = {}) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                }
            }
            Box {
                Button(onClick = {}) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                }
            }
        }
        Text("Result:")
    }
}

@Preview
@Composable
fun UnitConverterPreview() {
    UnitConverter()
}
