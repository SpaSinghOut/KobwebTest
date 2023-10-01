package com.spartanlabs.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.text.SpanText

@Page
@Composable
fun HomePage() {
    // TODO: Add content here
    //println("Hello World!")
    Column(Modifier.fillMaxSize()) {
        SpanText("Hello, world!")
    }
}
