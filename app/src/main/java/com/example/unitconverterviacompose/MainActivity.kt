package com.example.unitconverterviacompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unitconverterviacompose.ui.theme.UnitConverterViaComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterViaComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    UnitConverter()
                }
            }
        }
    }
}

//@Composable
//fun UnitConverter() {
//    var inputValue by remember{ mutableStateOf("") }
//    var outputValue by remember{ mutableStateOf("") }
//    var inputUnit by remember{ mutableStateOf("Centimeters") }
//    var outputUnit by remember{ mutableStateOf("Meters") }
//    var iExpanded by remember{ mutableStateOf(false) }
//    var oExpanded by remember{ mutableStateOf(false) }
//    val conversionFactor = remember{ mutableStateOf(0.01) }
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        //here all the elements will be stacked below each other
//        Text(text = "Unit Converter", modifier = Modifier.padding(16.dp))
////        Spacer(modifier = Modifier.height(16.dp))
//        OutlinedTextField(value = "", onValueChange = {
//            //Here goes what should happen when the value of our outlined textView changes})
//        })
//        Spacer(modifier = Modifier.height(16.dp))
//        Row {
//            //here all the elements will stack side by side
//            /*
//            var count =0;
//            val context = LocalContext.current
//            Button(onClick = {
//                count++
//                Toast.makeText(context,"Button was clicked $count times!!",Toast.LENGTH_SHORT).show() })
//            {
//                Text(text = "ClickMe")
//
//            }
//             */
//A box is a layout element just like a row and column.
//It works differently in that it arranges and stacks composables on top of each other.
//It is commonly used to create custom and complex layouts, because the dropdown menu cannot stand
//on its own, as it requires a parent,which can help it position itself ont he screen
//            Box {
//                Button(onClick = { /*TODO*/ }) {
//                    Text(text = "Select")
//                    Icon(
//                        Icons.Default.ArrowDropDown,
//                        "Drop Down"
//                    )//contentDescription if for visually challenged people
//
//                }
//                DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {
//                    DropdownMenuItem(
//                        text = { Text(text = "Centimeters") },
//                        onClick = { /*TODO*/ }
//                    )
//                    DropdownMenuItem(
//                        text = { Text(text = "Meters") },
//                        onClick = { /*TODO*/ }
//                    )
//                    DropdownMenuItem(
//                        text = { Text(text = "Feet") },
//                        onClick = { /*TODO*/ }
//                    )
//                    DropdownMenuItem(
//                        text = { Text(text = "Millimeters") },
//                        onClick = { /*TODO*/ }
//                    )
//                }
//            }
//            Spacer(modifier = Modifier.width(16.dp))
//            Box {
//                Button(onClick = { /*TODO*/ }) {
//                    Text(text = "Select")
//                    Icon(
//                        Icons.Default.ArrowDropDown,
//                        "Drop Down"
//                    )//contentDescription if for visually challenged people
//
//                }
//                DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {
//                    DropdownMenuItem(
//                        text = { Text(text = "Centimeters") },
//                        onClick = { /*TODO*/ }
//                    )
//                    DropdownMenuItem(
//                        text = { Text(text = "Meters") },
//                        onClick = { /*TODO*/ }
//                    )
//                    DropdownMenuItem(
//                        text = { Text(text = "Feet") },
//                        onClick = { /*TODO*/ }
//                    )
//                    DropdownMenuItem(
//                        text = { Text(text = "Millimeters") },
//                        onClick = { /*TODO*/ }
//                    )
//                }
//            }
//        }
//        Spacer(modifier = Modifier.height(16.dp))
//        Text(text = "Result:")
//    }
//}


@Composable
fun UnitConverter() {
    Column(
        Modifier.fillMaxSize(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {
        //Here all UI elements will be stacked vertically
        Text(text = "Unit Converter")
        Spacer(modifier = Modifier.height(16.dp))//dp os relative pixel value

        OutlinedTextField(
            value = "",
            onValueChange = {})//here onValChange tell the action that happen when value is changed
        // here {} is an anonymous function
        Spacer(modifier = Modifier.height(16.dp))
        Row {

            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }
                DropdownMenu(expanded = true, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(
                        text = { Text(text = "Millimeter") },
                        onClick = { /*TODO*/ })
                    DropdownMenuItem(
                        text = { Text(text = "Centimeter") },
                        onClick = { /*TODO*/ }
                    )
                    DropdownMenuItem(
                        text = { Text(text = "Meter") },
                        onClick = { /*TODO*/ }
                    )
                    
                }
            }
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")

                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Result:")
    }
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverter()
}