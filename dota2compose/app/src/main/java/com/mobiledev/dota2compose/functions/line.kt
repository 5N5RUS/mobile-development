package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun line(){
    Divider(
        color = Color(0xFF1A1F29),
        thickness = 1.dp,
        modifier = Modifier
            .padding(38.dp, 24.dp)
    )
}