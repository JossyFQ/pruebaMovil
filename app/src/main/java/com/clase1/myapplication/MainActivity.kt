package com.clase1.myapplication

//import com.clase1.myapplication.ui.theme.MyApplicationTheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.clase1.myapplication.data.libros
import com.clase1.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                    LibroApp()
            }
        }
    }
}

////////////////////////
@Preview(showBackground = true)
@Composable
fun SillaItemPreview() {

    MyApplicationTheme {
        LibroItem(
            libro = libros[0],
            onClick = {}
        )
    }
}