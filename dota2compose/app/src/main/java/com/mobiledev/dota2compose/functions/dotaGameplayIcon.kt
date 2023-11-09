package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mobiledev.dota2compose.R

@Composable
fun dotaGameplayIcon(){
    Box(
        modifier = Modifier
            .border(width = 0.7.dp, color = Color(R.color.dota__gameplay__color))
            .padding(0.7.dp)
            .offset(96.dp, 43.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.dota_gameplay_icon),
            contentDescription = "Dota gameplay icon",
            modifier = Modifier
                .size(dimensionResource(id = R.dimen.dota__gameplay__icon))
        )
    }
}