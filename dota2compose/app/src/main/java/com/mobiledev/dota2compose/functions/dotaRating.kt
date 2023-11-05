package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mobiledev.dota2compose.R

@Composable
fun dotaRating(){
    Image(
        painter = painterResource(id = R.drawable.all_stars),
        contentDescription = "All five stars",
        modifier = Modifier
            .size(76.dp, 12.dp)
    )
    Text(
        modifier = Modifier
            .padding(start = 10.dp),
        text = "70M",
        style = TextStyle(
            fontSize = 12.sp,
            fontFamily = FontFamily(Font(R.font.sk_modernist)),
            fontWeight = FontWeight(400),
            color = Color(0xFF45454D),
            letterSpacing = 0.5.sp,
        )
    )
}