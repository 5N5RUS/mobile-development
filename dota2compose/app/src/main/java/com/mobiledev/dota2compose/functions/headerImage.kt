package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mobiledev.dota2compose.R

@Composable
fun headerImage(){
    Image(
        painter = painterResource(id = R.drawable.header_image),
        contentDescription = "HeaderImage",
        modifier = Modifier
            .size(
                dimensionResource(id = R.dimen.header__image__width),
                dimensionResource(id = R.dimen.header__image__height)
                )
    )
}