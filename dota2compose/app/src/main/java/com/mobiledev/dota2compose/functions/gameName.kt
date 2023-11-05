package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun gameName(){
    Text(
        modifier = Modifier
            .padding(top = 345.dp),
        text = "DoTA 2",
        style = TextStyle(
            fontSize = 20.sp,
            lineHeight = 26.sp,
            fontFamily = FontFamily(Font(R.font.sk_modernist)),
            fontWeight = FontWeight(700),
            color = Color(0xFFFFFFFF),
            letterSpacing = 0.5.sp,
        )
    )
}