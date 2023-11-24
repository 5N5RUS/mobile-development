package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mobiledev.dota2compose.R
import com.mobiledev.dota2compose.ui.theme.gameName

@Preview
@Composable
fun gameName(){
    Text(
        modifier = Modifier
            .padding(top = 345.dp),
        text = stringResource(id = R.string.gameName),
        style = MaterialTheme.typography.gameName
    )
}