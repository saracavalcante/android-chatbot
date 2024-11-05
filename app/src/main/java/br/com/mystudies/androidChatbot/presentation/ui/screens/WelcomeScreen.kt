package br.com.mystudies.androidChatbot.presentation.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.mystudies.androidChatbot.R
import br.com.mystudies.androidChatbot.presentation.theme.MyFontFamily
import br.com.mystudies.androidChatbot.presentation.ui.components.BackgroundContent
import br.com.mystudies.androidChatbot.presentation.ui.components.DefaultButton

@Composable
fun WelcomeScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        BackgroundContent()
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .padding(top = 135.dp, start = 36.dp),
                painter = painterResource(R.drawable.ic_buddy),
                contentDescription = null
            )
            Spacer(Modifier.height(45.dp))
            Text(
                text = "Fale com o Buddy, seu novo amigo virtual",
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                style = TextStyle(fontFamily = MyFontFamily()),
                color = Color(0xff212226)
            )
            Spacer(Modifier.height(16.dp))
            Text(
                text = "Buddy é muito inteligente e vai responder à todas as sua perguntas.",
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                style = TextStyle(fontFamily = MyFontFamily()),
                color = Color(0xff949BA5)
            )
            Spacer(Modifier.height(32.dp))
            DefaultButton(
                modifier = Modifier.fillMaxWidth(),
                buttonText = "Começar",
                onClick = {}
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewScreen() {
    WelcomeScreen()
}