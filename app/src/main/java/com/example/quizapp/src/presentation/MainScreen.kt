package com.example.quizapp.src.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizapp.R
import com.example.quizapp.ui.theme.QuizAppTheme

@Composable
fun MainScreen(modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize()
    .background(brush = Brush.verticalGradient(colors = listOf(
        colorResource(R.color.color_primary_background), colorResource(R.color.color_secondary_background)
    )
    )
    ),
    verticalArrangement =  Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = stringResource(R.string.display_name),
            modifier = modifier.padding(bottom = 7.dp),
            color = colorResource(R.color.color_text_primary),
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold)

        Card (modifier = modifier
            .padding(top = 12.dp)
            .padding(horizontal = 20.dp)
            .height(200.dp)
            .fillMaxWidth()){

            Box(modifier = modifier
                .fillMaxSize(),
                contentAlignment =  Alignment.Center){

            }

        }
    }
}

@PreviewLightDark
@Composable
fun HomeScreenPreview(){

    QuizAppTheme {
        MainScreen()
    }

}
