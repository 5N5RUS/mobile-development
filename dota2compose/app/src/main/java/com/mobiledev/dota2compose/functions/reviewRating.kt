package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
fun reviewRating(){
    Row(
        modifier = Modifier
            .padding(start = 24.dp, top =  12.dp)
    ) {
        Text(
            text = "4.9",
            style = TextStyle(
                fontSize = 48.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist)),
                fontWeight = FontWeight(700),
                color = Color(0xFFFFFFFF),
            )
        )
        Column(
            modifier = Modifier
                .padding(start = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.almost_all_stars),
                contentDescription = "Stars icons",
                modifier = Modifier
                    .padding(top = 17.dp)
                    .size(76.dp, 12.dp)
            )
            Text(
                modifier = Modifier
                    .padding(top = 8.dp, end = 7.dp),
                text = "70M Reviews",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFFA8ADB7),
                    letterSpacing = 0.5.sp,
                )
            )
        }
    }
}