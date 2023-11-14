package com.mobiledev.dota2compose.functions

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mobiledev.dota2compose.R
import com.mobiledev.dota2compose.ui.theme.reviewDate
import com.mobiledev.dota2compose.ui.theme.reviewText
import com.mobiledev.dota2compose.ui.theme.reviewerName

@Composable
fun review(
    @DrawableRes avatar: Int,
    name: String,
    date: String,
    review: String
){
    Row(
        modifier = Modifier
            .padding(start = 24.dp)
    ) {
        Image(
            painter = painterResource(avatar),
            contentDescription = "Reviewer avatar",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .size(dimensionResource(id = R.dimen.review__image))
                .padding(top = 2.dp),
        )
        Column(
            modifier = Modifier
                .padding(start = 15.dp),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                modifier = Modifier
                    .padding(bottom = 7.dp),
                text = name,
                style = MaterialTheme.typography.reviewerName
            )
            Text(
                text = date,
                style = MaterialTheme.typography.reviewDate
            )
        }
    }
    Text(
        modifier = Modifier
            .padding(24.dp, 16.dp, 24.dp, 0.dp),
        text = review,
        style = MaterialTheme.typography.reviewText
    )
}

@Preview
@Composable
fun reviewPreview() {
    review(
        avatar = R.drawable.auguste,
        name = stringResource(id = R.string.augusteName),
        date = stringResource(id = R.string.commentDate),
        review = stringResource(id = R.string.reviewText)
    )
    review(
        avatar = R.drawable.jang,
        name = stringResource(id = R.string.jangName),
        date = stringResource(id = R.string.commentDate),
        review = stringResource(id = R.string.reviewText)
    )
}