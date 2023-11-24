package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mobiledev.dota2compose.R
@Preview
@Composable
fun dotaIcon(){
    Image(
        painter = painterResource(id = R.drawable.dota_icon),
        contentDescription = "Dota icon block",
        modifier = Modifier
            .padding(top = 305.dp)
            .size(dimensionResource(id = R.dimen.dota__icon))
    )
}