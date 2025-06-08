import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    var input by remember { mutableStateOf("") }
    var output by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Column {
            TextField(
                value = input,
                onValueChange = { input = it },
                label = { Text("Írd be a szöveget") }
            )

            Button(onClick = {
                output = "Beírt szöveg: $input"
            }) {
                Text("Kattints")
            }

            Text(output)
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
