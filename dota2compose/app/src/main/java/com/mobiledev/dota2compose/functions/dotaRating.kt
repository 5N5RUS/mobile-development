package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
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
            .size(
                dimensionResource(id = R.dimen.stars__width),
                dimensionResource(id = R.dimen.stars__height)
            )
    )
    Text(
        modifier = Modifier
            .padding(start = 10.dp),
        text = "70M",
        style = TextStyle(
            fontSize = 12.sp,
            fontFamily = FontFamily(Font(R.font.sk_modernist)),
            fontWeight = FontWeight(400),
            color = colorResource(R.color.rating__color),
            letterSpacing = 0.5.sp,
        )
    )
}