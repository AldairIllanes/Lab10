package com.example.lab10.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkAppColorScheme = darkColorScheme(
    primary = MutedRed,
    onPrimary = Color.White,
    primaryContainer = Color(0xFF3E0A0E),
    onPrimaryContainer = MutedRed,
    secondary = DeepMutedRed,
    onSecondary = Color.White,
    tertiary = AccentGold,
    onTertiary = Color.Black,
    background = DarkBackground,
    onBackground = Color.White,
    surface = DarkSurface,
    onSurface = Color.White,
    surfaceVariant = DarkCardGrey,
    onSurfaceVariant = LightGrey,
    outline = MutedText,
    error = Color(0xFFEF5350),
    onError = Color.White
)

@Composable
fun Lab10Theme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkAppColorScheme,
        typography = Typography,
        content = content
    )
}
