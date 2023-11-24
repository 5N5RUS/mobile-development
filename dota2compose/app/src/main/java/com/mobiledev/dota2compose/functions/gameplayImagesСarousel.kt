package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun gameplayImagesCarousel(){
    Row(
        modifier = Modifier
            .padding(start = 24.dp, top = 15.dp)
            .horizontalScroll(rememberScrollState()),
    ) {
        gameplayImages()
    }
}
