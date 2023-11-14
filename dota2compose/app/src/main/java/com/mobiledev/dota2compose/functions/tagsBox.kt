package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun tagsBox(){
    Box(
        modifier = Modifier
            .offset(24.dp, (-20).dp)
    ){
        Row{
            tags()
        }
    }
}