package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                Box{
                    GreetingImage()
                    GreetingText(
                        message = "Happy Birthday Charlie!",
                        from = "from Mohamed",
                        modifier = Modifier.padding(8.dp)
                    )
                }

            }
        }
    }
}


@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            modifier = Modifier.padding(8.dp).fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Text(
            text = from,
            fontSize = 36.sp,
            lineHeight = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End),


        )
    }
}


@Composable
fun GreetingImage() {
    Image(
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(R.drawable.androidparty),
        contentDescription = "Happy Birthday, Charlie!",
        alpha = 0.5F
    )
}

@Preview(
    showBackground = true,
    showSystemUi = false,
    name = "Birthday Card Preview"
)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        Box{
            GreetingImage()
            GreetingText(
                message = "Happy Birthday Charlie!",
                from = "from Mohamed",
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}