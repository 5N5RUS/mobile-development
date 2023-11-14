package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun header(){
    Box{
        headerImage()
        dotaIcon()
        Column(
            modifier = Modifier
                .padding(start = 124.dp, top = 14.dp)
        ) {
            gameName()
            Row(
                modifier = Modifier
                    .padding(top = 7.dp),
            ) {
                dotaRating()
            }
        }
    }
}