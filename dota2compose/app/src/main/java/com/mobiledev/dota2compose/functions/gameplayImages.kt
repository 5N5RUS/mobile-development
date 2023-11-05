package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mobiledev.dota2compose.R
import com.mobiledev.dota2compose.functions.dotaGameplayIcon

@Composable
fun gameplayImages(){
    Box {
        Image(
            painter = painterResource(id = R.drawable.gameplay1),
            contentDescription = "First gameplay image",
            modifier = Modifier
                .size(240.dp, 128.dp)
                .clip(RoundedCornerShape(14.dp)),
            contentScale = ContentScale.FillBounds
        )
        dotaGameplayIcon()
    }
    Image(
        painter = painterResource(id = R.drawable.gameplay2),
        contentDescription = "Second gameplay image",
        modifier = Modifier
            .size(240.dp, 128.dp)
            .padding(start = 15.dp)
            .clip(RoundedCornerShape(14.dp)),
        contentScale = ContentScale.FillBounds
    )
}