package br.com.mystudies.androidChatbot.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.mystudies.androidChatbot.R
import br.com.mystudies.androidChatbot.presentation.theme.MyFontFamily

@Composable
fun MessageInput(
    modifier: Modifier = Modifier,
    onSendClick: () -> Unit
) {
    var message by remember { mutableStateOf(TextFieldValue("")) }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            modifier = Modifier.weight(1f),
            value = message,
            onValueChange = { message = it },
            placeholder = {
                Text(
                    text = "Faça sua pergunta",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    style = TextStyle(fontFamily = MyFontFamily()),
                    color = Color(0xff212226)
                )
            },
            textStyle = TextStyle(fontFamily = MyFontFamily()),
            shape = CircleShape,
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xffEBECEF),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
        IconButton(
            modifier = Modifier
                .padding(8.dp)
                .background(
                    color = Color(0xff212226),
                    shape = CircleShape
                ),
            onClick = onSendClick
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_upward_24),
                contentDescription = null,
                tint = Color.White
            )
        }
    }
}