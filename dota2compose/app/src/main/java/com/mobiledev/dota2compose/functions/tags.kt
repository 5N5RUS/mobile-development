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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
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
            .size(
                dimensionResource(id = R.dimen.first__tag__width),
                dimensionResource(id = R.dimen.tags__height),
            )
            .background(
                color = colorResource(R.color.tags__background),
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
                    color = colorResource(R.color.tags__text),
                )
            )
        }
    }
    Box(
        modifier = Modifier
            .size(
                dimensionResource(id = R.dimen.second__tag__width),
                dimensionResource(id = R.dimen.tags__height),
            )
            .offset(10.dp)
            .background(
                color = colorResource(R.color.tags__background),
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
                    color = colorResource(R.color.tags__text),
                )
            )
        }
    }
    Box(
        modifier = Modifier
            .size(
                dimensionResource(id = R.dimen.third__tag__width),
                dimensionResource(id = R.dimen.tags__height),
            )
            .offset(20.dp)
            .background(
                color = colorResource(R.color.tags__background),
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
                    color = colorResource(R.color.tags__text),
                )
            )
        }
    }
}