package br.edu.ifce.ads.todo_app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import br.edu.ifce.ads.todo_app.ui.theme.AppBg

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoScreen(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier,
        topBar = { TopBar() },
        containerColor = AppBg
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(AppBg)
                .padding(innerPadding)
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            TaskHeader(3)
            TaskForm()
            TaskCard(false, "Revisar e-mail do cliente")
            TaskCard(true, "Estudar Kotlin")
            TaskCard(false, "Estudar arquitetura")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar() = TopAppBar(
    title = {
        Text("Lista de Tarefas")
    }
)

@Composable
private fun TaskHeader(value: Int) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF22C55E).copy(alpha = 0.12f))
    ) {
        Column(
            modifier = Modifier.padding(12.dp)
        ) {
            Text(
                text = value.toString(),
                style = MaterialTheme
                    .typography
                    .titleLarge
                    .copy(fontWeight = FontWeight.Bold)
            )
            Text(
                text = "Pendentes",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Composable
private fun TaskForm() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF0FFFF))
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = { },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("Adicionar tarefa") },
                singleLine = true
            )
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Adicionar")
            }
        }
    }
}

@Composable
private fun TaskCard(checked: Boolean, text: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF0FFFF))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = checked,
                onCheckedChange = {}
            )
            Text(text)
        }
    }
}