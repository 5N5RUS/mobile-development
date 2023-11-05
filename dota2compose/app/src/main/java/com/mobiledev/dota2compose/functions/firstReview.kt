package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
fun firstReview(){
    Row(
        modifier = Modifier
            .padding(start = 24.dp, top = 30.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.auguste),
            contentDescription = "Auguste image",
            modifier = Modifier
                .size(38.dp)
                .padding(top = 2.dp),
        )
        Column(
            modifier = Modifier
                .padding(start = 15.dp),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                modifier = Modifier
                    .padding(bottom = 7.dp),
                text = "Auguste Conte",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                    letterSpacing = 0.5.sp,
                )
            )
            Text(
                text = "February 14, 2019",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist)),
                    fontWeight = FontWeight(400),
                    color = Color(0x66FFFFFF),
                    letterSpacing = 0.5.sp,
                )
            )
        }
    }
    Text(
        modifier = Modifier
            .padding(24.dp, 16.dp, 24.dp, 0.dp),
        text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
        style = TextStyle(
            fontSize = 12.sp,
            lineHeight = 20.sp,
            fontFamily = FontFamily(Font(R.font.sk_modernist)),
            fontWeight = FontWeight(400),
            color = Color(0xFFA8ADB7),
            letterSpacing = 0.5.sp,),
    )
}