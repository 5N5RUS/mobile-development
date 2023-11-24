package com.mobiledev.dota2compose.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mobiledev.dota2compose.R

// Set of Material typography styles to start with
val Typography = Typography(
        bodyLarge = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.5.sp
        )
)

val Typography.dotaDescription: TextStyle
@Composable
get() {
        return TextStyle(
                fontSize = 12.sp,
                lineHeight = 19.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist)),
                fontWeight = FontWeight(400),
                color = colorResource(R.color.text),
        )
}

val Typography.dotaRating: TextStyle
        @Composable
        get() {
                return TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(400),
                        color = colorResource(R.color.rating__color),
                        letterSpacing = 0.5.sp,
                )
        }

val Typography.gameName: TextStyle
        @Composable
        get() {
                return TextStyle(
                        fontSize = 20.sp,
                        lineHeight = 26.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(700),
                        color = colorResource(R.color.white),
                        letterSpacing = 0.5.sp,
                )
        }

val Typography.installButton: TextStyle
        @Composable
        get() {
                return TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(700),
                        color = colorResource(R.color.background),
                        letterSpacing = 0.6.sp,
                )
        }

val Typography.reviewerName: TextStyle
        @Composable
        get() {
                return TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(400),
                        color = colorResource(R.color.white),
                        letterSpacing = 0.5.sp,
                )
        }

val Typography.reviewDate: TextStyle
        @Composable
        get() {
                return TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(400),
                        color = colorResource(R.color.data__color),
                        letterSpacing = 0.5.sp,
                )
        }

val Typography.reviewText: TextStyle
        @Composable
        get() {
                return TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 20.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(400),
                        color = colorResource(R.color.commemt__text),
                        letterSpacing = 0.5.sp
                )
        }

val Typography.reviewHeader: TextStyle
        @Composable
        get() {
                return TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(700),
                        color = colorResource(R.color.review__header),
                        letterSpacing = 0.6.sp,
                )
        }

val Typography.reviewRatingNum: TextStyle
        @Composable
        get() {
                return TextStyle(
                        fontSize = 48.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(700),
                        color = colorResource(R.color.white),
                )
        }

val Typography.reviewRating: TextStyle
        @Composable
        get() {
                return TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(400),
                        color = colorResource(R.color.commemt__text),
                        letterSpacing = 0.5.sp,
                )
        }

val Typography.tags: TextStyle
        @Composable
        get() {
                return TextStyle(
                        fontSize = 10.sp,
                        fontFamily = FontFamily(Font(R.font.montserrat)),
                        fontWeight = FontWeight(500),
                        color = colorResource(R.color.tags__text),
                )
        }
