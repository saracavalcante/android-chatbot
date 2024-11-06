package br.com.mystudies.androidChatbot.presentation.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.mystudies.androidChatbot.R
import br.com.mystudies.androidChatbot.presentation.theme.MyFontFamily
import br.com.mystudies.androidChatbot.presentation.ui.components.AnswerComponent
import br.com.mystudies.androidChatbot.presentation.ui.components.MessageInput
import br.com.mystudies.androidChatbot.presentation.ui.components.TopBarContent

@Composable
fun ConversationScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBarContent() },
        bottomBar = { MessageInput(onSendClick = {}) }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding)
        ) {
            MessageHeader()
            MessagesContent()
        }
    }
}

@Composable
fun MessagesContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalAlignment = Alignment.End
    ) {
        AnswerComponent()
    }
}

@Composable
fun MessageHeader(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color(0xff212226))
            .padding(24.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(R.drawable.ic_talk_buddy),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "Meu tempo de resposta é de alguns segundos a até 2 minutos para questões mais complexas.",
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                style = TextStyle(fontFamily = MyFontFamily()),
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
private fun PreviewScreen() {
    ConversationScreen()
}