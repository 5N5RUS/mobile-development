package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
fun tags(){
    Box(
        modifier = Modifier
            .size(53.dp, 22.dp)
            .background(
                color = Color(0x3D44A9F4),
                shape = RoundedCornerShape(size = 100.dp)
            )
    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(10.dp, 5.dp)
        ) {
            Text(
                text = "MOBA",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF44A9F4),
                )
            )
        }
    }
    Box(
        modifier = Modifier
            .size(93.dp, 22.dp)
            .offset(10.dp)
            .background(
                color = Color(0x3D44A9F4),
                shape = RoundedCornerShape(size = 100.dp)
            )
    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(10.dp, 5.dp)
        ) {
            Text(
                text = "MULTIPLAYER",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF44A9F4),
                )
            )
        }
    }
    Box(
        modifier = Modifier
            .size(73.dp, 22.dp)
            .offset(20.dp)
            .background(
                color = Color(0x3D44A9F4),
                shape = RoundedCornerShape(size = 100.dp)
            )
    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(10.dp, 5.dp)
        ) {
            Text(
                text = "STRATEGY",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF44A9F4),
                )
            )
        }
    }
}