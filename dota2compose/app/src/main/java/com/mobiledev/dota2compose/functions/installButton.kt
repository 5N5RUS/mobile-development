package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mobiledev.dota2compose.R

@Composable
fun installButton() {
    Box(
        modifier = Modifier
            .padding(24.dp, 40.dp)
            .background(
                color = Color(0xFFF4D144),
                shape = RoundedCornerShape(size = 12.dp)
            )
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(134.dp, 20.dp)
        ) {
            Text(
                text = "Install",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF050B18),
                    letterSpacing = 0.6.sp,
                )
            )
        }
    }
}