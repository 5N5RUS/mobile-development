package com.mobiledev.dota2compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mobiledev.dota2compose.functions.dotaDescription
import com.mobiledev.dota2compose.functions.dotaIcon
import com.mobiledev.dota2compose.functions.dotaRating
import com.mobiledev.dota2compose.functions.firstReview
import com.mobiledev.dota2compose.functions.gameName
import com.mobiledev.dota2compose.functions.gameplayImages
import com.mobiledev.dota2compose.functions.headerImage
import com.mobiledev.dota2compose.functions.installButton
import com.mobiledev.dota2compose.functions.line
import com.mobiledev.dota2compose.functions.reviewHeader
import com.mobiledev.dota2compose.functions.reviewRating
import com.mobiledev.dota2compose.functions.secondReview
import com.mobiledev.dota2compose.functions.tags

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(color = Color(0xFF050B18))
                    .verticalScroll(rememberScrollState()),
            ) {
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
                Box(
                    modifier = Modifier
                        .offset(24.dp, (-20).dp)
                ){
                    Row{
                        tags()
                    }
                }
                dotaDescription()
                Row(
                    modifier = Modifier
                        .padding(start = 24.dp, top = 15.dp)
                        .horizontalScroll(rememberScrollState()),
                ) {
                    gameplayImages()
                }
                reviewHeader()
                reviewRating()
                firstReview()
                line()
                secondReview()
                installButton()
                }
            }
        }
    }













