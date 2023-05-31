package com.hiram.pdm123

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.hiram.pdm123.IMC.IndiceScreen
import com.hiram.pdm123.IMC.IndiceViewModel
import com.hiram.pdm123.SubManager.Items_menu
import com.hiram.pdm123.agua.WaterConsumeScreen
import com.hiram.pdm123.agua.WaterConsumeViewModel
import com.hiram.pdm123.futbol.marcadorScreen
import com.hiram.pdm123.futbol.marcadorViewModel
import com.hiram.pdm123.grados.GradosScreen
import com.hiram.pdm123.grados.GradosViewModel
import com.hiram.pdm123.sumaapp.SumaScreen
import com.hiram.pdm123.sumaapp.SumaViewModel
import com.hiram.pdm123.ui.theme.PDM123Theme
import com.hiram.pdm123.SubManager.Items_menu.*
import com.hiram.pdm123.SubManager.NavigationHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PDM123Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Surface {


                        Screen()

                    }

                }


            }
        }
    }
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Screen() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()


    val navigation_item = listOf(
        screen_home,
        screen_search,
        screen_finance
    )
    Scaffold(scaffoldState = scaffoldState,
        bottomBar = { NavigationInferior(navController, navigation_item) }){
        NavigationHost(navController)

    }
}

@Composable
fun currentRoute(navController: NavHostController): String? {
    val entrada by navController.currentBackStackEntryAsState()
    return entrada?.destination?.route
}

@Composable
fun NavigationInferior(
    navController: NavHostController,
    menu_items: List<Items_menu>
) {
    BottomAppBar() {
        BottomNavigation() {
            val currentRoute = currentRoute(navController = navController)
            menu_items.forEach { item ->
                BottomNavigationItem(
                    selected = currentRoute == item.ruta, onClick = { navController.navigate(item.ruta) },
                    icon = {
                        Icon(
                            painter = painterResource(id = item.icon),
                            contentDescription = item.title
                        )
                    },
                    label = { Text(item.title)},
                    alwaysShowLabel = false
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenPreview() {
    PDM123Theme {
        Screen()
    }
}

@Composable
fun ejercicio1() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .background(color = Color.Cyan),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Edwin Hiram Varela Rubio 11664")
        }
    }
}

@Composable
fun Menu() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        Button(modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #1")


        }
        Button(modifier = Modifier

            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #2")
        }
        Button(modifier = Modifier

            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #3")
        }
        Button(modifier = Modifier

            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #4")
        }
        Button(modifier = Modifier

            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #5")
        }
        Button(modifier = Modifier

            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #6")
        }
        Button(modifier = Modifier

            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #7")
        }
        Button(modifier = Modifier

            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #8")
        }
        Button(modifier = Modifier

            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #9")
        }
        Button(modifier = Modifier

            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #10")
        }
        Button(modifier = Modifier

            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #11")
        }
        Button(modifier = Modifier

            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #12")
        }
        Button(modifier = Modifier

            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #13")
        }
        Button(modifier = Modifier

            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #14")
        }
        Button(modifier = Modifier

            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp), onClick = {}) {
            Text(text = "Practica #15")
        }

    }
}

@Composable
fun imagen() {
    Row() {
        Image(
            painter = painterResource(id = R.drawable.jetta),
            contentDescription = "My Image",
            modifier = Modifier
                .size(100.dp)
        )
        Text(text = "Edwin Hiram Varela Rubio")
        Spacer(modifier = Modifier.width(30.dp))
        Text(text = "11664")
    }
}


@Composable
fun previewCuadro() {
    PDM123Theme {
        marcadorScreen(viewModel = marcadorViewModel())
    }

}

//@Preview(showBackground = true)
//@Composable
//fun previewMenu() {
//    PDM123Theme {
//
//        Menu()
//
//
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun previewImagen() {
//    PDM123Theme {
//        imagen()
//    }
//
//}

