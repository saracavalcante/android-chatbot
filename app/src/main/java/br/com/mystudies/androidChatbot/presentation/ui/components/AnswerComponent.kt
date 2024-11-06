package br.com.mystudies.androidChatbot.presentation.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.mystudies.androidChatbot.presentation.theme.MyFontFamily

@Composable
fun AnswerComponent() {
    Surface(
        shape = RoundedCornerShape(8.dp, 8.dp, 0.dp, 8.dp),
        color = Color(0xff212226)
    ) {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Text(
                text = "Testando mensagem",
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                style = TextStyle(fontFamily = MyFontFamily()),
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewComponent() {
    AnswerComponent()
}