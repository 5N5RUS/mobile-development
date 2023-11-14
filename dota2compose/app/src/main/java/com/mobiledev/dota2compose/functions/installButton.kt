package com.mobiledev.dota2compose.functions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mobiledev.dota2compose.R
import com.mobiledev.dota2compose.ui.theme.installButton

@Preview
@Composable
fun installButton() {
        Box(
            modifier = Modifier
                .padding(24.dp, 40.dp)
                .background(
                    color = colorResource(R.color.install__button),
                    shape = RoundedCornerShape(size = 12.dp)
                )
                .fillMaxWidth()
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(134.dp, 20.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.istallButton),
                    style = MaterialTheme.typography.installButton
                )
            }
        }

}