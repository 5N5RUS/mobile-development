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
import com.mobiledev.dota2compose.ui.theme.reviewHeader

@Preview
@Composable
fun reviewHeader(){
    Text(
        modifier = Modifier
            .padding(start = 24.dp, top = 20.dp),
        text = stringResource(id = R.string.reviewHeader),
        style = MaterialTheme.typography.reviewHeader
    )
}