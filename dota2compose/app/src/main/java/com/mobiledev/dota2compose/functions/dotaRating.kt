package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mobiledev.dota2compose.R
import com.mobiledev.dota2compose.ui.theme.dotaRating

@Preview
@Composable
fun dotaRating(){
    Image(
        painter = painterResource(id = R.drawable.all_stars),
        contentDescription = "All five stars",
        modifier = Modifier
            .size(
                dimensionResource(id = R.dimen.stars__width),
                dimensionResource(id = R.dimen.stars__height)
            )
    )
    Text(
        modifier = Modifier
            .padding(start = 10.dp),
        text = stringResource(id = R.string.dotaRating),
        style = MaterialTheme.typography.dotaRating
    )
}