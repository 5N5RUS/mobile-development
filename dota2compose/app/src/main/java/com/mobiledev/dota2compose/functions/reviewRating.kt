package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.mobiledev.dota2compose.ui.theme.reviewRating
import com.mobiledev.dota2compose.ui.theme.reviewRatingNum

@Preview
@Composable
fun reviewRating(){
    Row(
        modifier = Modifier
            .padding(start = 24.dp, top =  12.dp, bottom = 30.dp)
    ) {
        Text(
            text = stringResource(id = R.string.reviewRatingNum),
            style = MaterialTheme.typography.reviewRatingNum
        )
        Column(
            modifier = Modifier
                .padding(start = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.almost_all_stars),
                contentDescription = "Stars icons",
                modifier = Modifier
                    .padding(top = 17.dp)
                    .size(
                        dimensionResource(id = R.dimen.stars__width),
                        dimensionResource(id = R.dimen.stars__height)
                    )
            )
            Text(
                modifier = Modifier
                    .padding(top = 8.dp, end = 7.dp),
                text = stringResource(id = R.string.reviewRating),
                style = MaterialTheme.typography.reviewRating
            )
        }
    }
}