package com.spartanlabs.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.text.SpanText

@Page
@Composable
fun HomePage() {
    // TODO: Add content here
    println("Hello World!")
    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,){
        Row(verticalAlignment = Alignment.CenterVertically,){
            SpanText("Hello, world!")
        }
        SpanText("Hello, world!")
    }
}
