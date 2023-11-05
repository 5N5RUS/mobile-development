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
    @Composable
    fun headerImage(){
        Image(
            painter = painterResource(id = R.drawable.header_image),
            contentDescription = "HeaderImage",
            modifier = Modifier
                .size(628.dp, 354.dp)
        )
    }
    @Composable
    fun dotaIcon(){
        Image(
            painter = painterResource(id = R.drawable.dota_icon),
            contentDescription = "Dota icon block",
            modifier = Modifier
                .padding(start = 4.dp, top = 305.dp)
                .width(140.dp)
                .height(150.dp)
        )
    }
    @Composable
    fun gameName(){
        Text(
            modifier = Modifier
                .padding(top = 345.dp),
            text = "DoTA 2",
            style = TextStyle(
                fontSize = 20.sp,
                lineHeight = 26.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist)),
                fontWeight = FontWeight(700),
                color = Color(0xFFFFFFFF),
                letterSpacing = 0.5.sp,
            )
        )
    }
    @Composable
    fun dotaRating(){
        Image(
            painter = painterResource(id = R.drawable.all_stars),
            contentDescription = "All five stars",
            modifier = Modifier
                .size(76.dp, 12.dp)
        )
        Text(
            modifier = Modifier
                .padding(start = 10.dp),
            text = "70M",
            style = TextStyle(
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist)),
                fontWeight = FontWeight(400),
                color = Color(0xFF45454D),
                letterSpacing = 0.5.sp,
            )
        )
    }
    @Composable
    fun tags(){
        Box(
            modifier = Modifier
                .size(53.dp, 22.dp)
                .background(
                    color = Color(0x3D44A9F4),
                    shape = RoundedCornerShape(size = 100.dp)
                )
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(10.dp, 5.dp)
            ) {
                Text(
                    text = "MOBA",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontFamily = FontFamily(Font(R.font.montserrat)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF44A9F4),
                    )
                )
            }
        }
        Box(
            modifier = Modifier
                .size(93.dp, 22.dp)
                .offset(10.dp)
                .background(
                    color = Color(0x3D44A9F4),
                    shape = RoundedCornerShape(size = 100.dp)
                )
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(10.dp, 5.dp)
            ) {
                Text(
                    text = "MULTIPLAYER",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontFamily = FontFamily(Font(R.font.montserrat)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF44A9F4),
                    )
                )
            }
        }
        Box(
            modifier = Modifier
                .size(73.dp, 22.dp)
                .offset(20.dp)
                .background(
                    color = Color(0x3D44A9F4),
                    shape = RoundedCornerShape(size = 100.dp)
                )
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(10.dp, 5.dp)
            ) {
                Text(
                    text = "STRATEGY",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontFamily = FontFamily(Font(R.font.montserrat)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF44A9F4),
                    )
                )
            }
        }
    }
    @Composable
    fun dotaDescription(){
        Text(
            modifier = Modifier
                .padding(24.dp, 5.dp, 24.dp, 0.dp),
            text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 19.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist)),
                fontWeight = FontWeight(400),
                color = Color(0xB2EEF2FB),
            )
        )
    }
    @Composable
    fun gameplayImages(){
        Box {
            Image(
                painter = painterResource(id = R.drawable.gameplay1),
                contentDescription = "First gameplay image",
                modifier = Modifier
                    .size(240.dp, 128.dp)
                    .clip(RoundedCornerShape(14.dp)),
                contentScale = ContentScale.FillBounds
            )
            dotaGameplayIcon()
        }
        Image(
            painter = painterResource(id = R.drawable.gameplay2),
            contentDescription = "Second gameplay image",
            modifier = Modifier
                .size(240.dp, 128.dp)
                .padding(start = 15.dp)
                .clip(RoundedCornerShape(14.dp)),
            contentScale = ContentScale.FillBounds
        )
    }
    @Composable
    fun dotaGameplayIcon(){
        Box(
            modifier = Modifier
                .border(width = 0.7.dp, color = Color(0x00FFFFFF))
                .padding(0.7.dp)
                .offset(96.dp, 43.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.dota_gameplay_icon),
                contentDescription = "Dota gameplay icon",
                modifier = Modifier
                    .size(48.dp)
            )
        }
    }
    @Composable
    fun reviewHeader(){
        Text(
            modifier = Modifier
                .padding(start = 24.dp, top = 20.dp),
            text = "Review & Ratings",
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist)),
                fontWeight = FontWeight(700),
                color = Color(0xFFEEF2FB),
                letterSpacing = 0.6.sp,
            )
        )
    }
    @Composable
    fun reviewRating(){
        Row(
            modifier = Modifier
                .padding(start = 24.dp, top =  12.dp)
        ) {
            Text(
                text = "4.9",
                style = TextStyle(
                    fontSize = 48.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFFFFFFFF),
                )
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
                        .size(76.dp, 12.dp)
                )
                Text(
                    modifier = Modifier
                        .padding(top = 8.dp, end = 7.dp),
                    text = "70M Reviews",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFFA8ADB7),
                        letterSpacing = 0.5.sp,
                    )
                )
            }
        }
    }
    @Composable
    fun firstReview(){
        Row(
            modifier = Modifier
                .padding(start = 24.dp, top = 30.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.auguste),
                contentDescription = "Auguste image",
                modifier = Modifier
                    .size(38.dp)
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
                    text = "Auguste Conte",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),
                        letterSpacing = 0.5.sp,
                    )
                )
                Text(
                    text = "February 14, 2019",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(400),
                        color = Color(0x66FFFFFF),
                        letterSpacing = 0.5.sp,
                    )
                )
            }
        }
        Text(
            modifier = Modifier
                .padding(24.dp, 16.dp, 24.dp, 0.dp),
            text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 20.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist)),
                fontWeight = FontWeight(400),
                color = Color(0xFFA8ADB7),
                letterSpacing = 0.5.sp,),
        )
    }
    @Composable
    fun line(){
        Divider(
            color = Color(0xFF1A1F29),
            thickness = 1.dp,
            modifier = Modifier
                .padding(38.dp, 24.dp)
        )
    }
    @Composable
    fun secondReview(){
        Row(
            modifier = Modifier
                .padding(start = 24.dp)
                .background(color = Color(0xFF050B18))
        ) {
            Image(
                painter = painterResource(id = R.drawable.jang),
                contentDescription = "Jang image",
                modifier = Modifier
                    .size(38.dp)
                    .padding(top = 2.dp),
            )
            Column(
                modifier = Modifier
                    .padding(start = 15.dp),
                verticalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    modifier = Modifier.padding(bottom = 7.dp),
                    text = "Jang Marcelino",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),
                        letterSpacing = 0.5.sp,
                    )
                )
                Text(
                    text = "February 14, 2019",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(400),
                        color = Color(0x66FFFFFF),
                        letterSpacing = 0.5.sp,
                    )
                )
            }
        }
        Text(
            modifier = Modifier
                .padding(24.dp, 16.dp, 24.dp, 0.dp)
                .background(color = Color(0xFF050B18)) ,
            text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 20.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist)),
                fontWeight = FontWeight(400),
                color = Color(0xFFA8ADB7),
                letterSpacing = 0.5.sp,),
        )
    }
    @Composable
    fun installButton(){
        Box(
            modifier = Modifier
                .padding(24.dp, 40.dp)
                .background(
                    color = Color(0xFFF4D144),
                    shape = RoundedCornerShape(size = 12.dp)
                )
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(134.dp, 20.dp)
            ) {
                Text(
                    text = "Install",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFF050B18),
                        letterSpacing = 0.6.sp,
                    )
                )
            }
    }
}
