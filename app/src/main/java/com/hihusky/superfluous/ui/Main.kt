package com.hihusky.superfluous.ui

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hihusky.superfluous.R

@Preview
@Composable
fun Main() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        // Row(
        //     modifier = Modifier.fillMaxWidth(),
        //     horizontalArrangement = Arrangement.Center,
        // ) {
        //     Text(
        //         text = "功德 +1"
        //     )
        // }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(id = R.drawable.temple_block),
                contentDescription = "temple block image",
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp),
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = {
                    val mediaPlayer = MediaPlayer.create(context, R.raw.temple_block_sound_effect)
                    mediaPlayer.start()
                },
                colors = ButtonDefaults.buttonColors(Color(0xff, 0xff, 0xff))
                // Modifier.background(color = Color(0xff, 0xff, 0xff))
            ) {
                Text(text = "🙏")
            }
        }
    }
}