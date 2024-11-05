package br.com.mystudies.androidChatbot.presentation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.mystudies.androidChatbot.presentation.theme.MyFontFamily

@Composable
fun DefaultButton(
    modifier: Modifier = Modifier,
    buttonText: String,
    buttonIcon: Int? = null,
    onClick: () -> Unit
) {
    Surface(
        modifier = modifier
            .semantics { role = Role.Button },
        shape = RoundedCornerShape(14.dp),
        color = Color(0xff212226),
        onClick = onClick
    ) {
        Row(
            modifier = Modifier
                .padding(vertical = 15.dp)
                .defaultMinSize(minWidth = 163.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            buttonIcon?.let {
                Icon(
                    painter = painterResource(buttonIcon),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.width(8.dp))
            }
            Text(
                text = buttonText,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                style = TextStyle(fontFamily = MyFontFamily()),
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewButton() {
    DefaultButton(buttonText = "Começar") {}
}