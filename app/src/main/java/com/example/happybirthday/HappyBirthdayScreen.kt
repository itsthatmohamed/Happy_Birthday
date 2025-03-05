package com.example.happybirthday

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

@Composable
fun HappyBirthdayScreen(
    viewModel: HappyBirthdayViewModel = viewModel()
) {

    val state = viewModel.uiState.collectAsState()

    Box {
        GreetingImage()
        Column {
            GreetingText(
                message = state.value,
                from = stringResource(R.string.signature_text),
                modifier = Modifier.padding(8.dp)
            )
            Button(
                onClick = { viewModel.onButtonPressed() },
                content = {
                    Text("This is a button")
                }
            )
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
            modifier = Modifier
                .padding(
                    /*top = 263.dp*/
                )
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Text(
            text = from,
            fontSize = 36.sp,
            lineHeight = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally),


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
        Box {
            GreetingImage()
            GreetingText(
                message = "Happy Birthday Charlie!",
                from = "from Mohamed",
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}