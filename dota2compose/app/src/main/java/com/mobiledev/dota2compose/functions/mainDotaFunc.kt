package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.mobiledev.dota2compose.R

@Preview
@Composable
fun mainDotaFunc(){
    Column(
        modifier = Modifier
            .background(color = colorResource(R.color.background))
            .verticalScroll(rememberScrollState()),
    ) {
        header()
        tagsBox()
        dotaDescription()
        gameplayImagesCarousel()
        reviewHeader()
        reviewRating()
        review(
            avatar = R.drawable.auguste,
            name = stringResource(id = R.string.augusteName),
            date = stringResource(id = R.string.commentDate),
            review = stringResource(id = R.string.reviewText)
        )
        line()
        review(
            avatar = R.drawable.jang,
            name = stringResource(id = R.string.jangName),
            date = stringResource(id = R.string.commentDate),
            review = stringResource(id = R.string.reviewText)
        )
        installButton()
    }
}