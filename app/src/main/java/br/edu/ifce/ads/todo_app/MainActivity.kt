package br.edu.ifce.ads.todo_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.edu.ifce.ads.todo_app.ui.screens.TodoScreen
import br.edu.ifce.ads.todo_app.ui.theme.TodoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodoAppTheme {
                TodoScreen()
            }
        }
    }
}