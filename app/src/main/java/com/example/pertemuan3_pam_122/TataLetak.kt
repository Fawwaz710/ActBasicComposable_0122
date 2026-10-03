package com.example.pertemuan3_pam_122

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign

@Composable
fun TataletakColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier) {
    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(), contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier) {
    Column() {
        //Baris1
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }
        //Baris2
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier) {
    val gambar = painterResource(id = R.drawable.notasibalok)
    Column {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(color = Color.Yellow),
            contentAlignment = Alignment.Center
        ) {
            Column() {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "Nama: Muhammad Fawwaz Naufal Dzulfikar",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.weight(1.5f)
                    )
                    Text(
                        text = "NIM: 20240140122",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.weight(1f)
                    )
                    Text(
                        text = "Kelas C",
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.weight(1f)
                    )
                }
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1_Row2_Komponen1", fontSize = 12.sp,
                        textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
                    Text(text = "Col1_Row2_Komponen2", fontSize = 12.sp,
                        textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
                    Text(text = "Col1_Row2_Komponen3", fontSize = 12.sp,
                        textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
                }
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .weight(1f)
                .shadow(4.dp, RoundedCornerShape(12.dp))
                .clip(RoundedCornerShape(12.dp))
                .background(color = Color(0xFFB2EBF2))
                .border(1.dp, Color(0xFFBDBDBD), RoundedCornerShape(12.dp)),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = gambar,
                contentDescription = "Gambar notasi balok",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(200.dp))
            Text(text = "Messi",
                fontSize = 50.sp,
                color = Color(0xFFC62828),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.White,
                        offset = Offset(2f, 2f),
                        blurRadius = 8f
                    )
                ),
                modifier = Modifier.align(
                    alignment = Alignment.Center))
        }
    }
}