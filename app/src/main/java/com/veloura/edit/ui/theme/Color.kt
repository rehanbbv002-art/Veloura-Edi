package com.veloura.edit.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = VelouraColors.PrimaryViolet,
    secondary = VelouraColors.CyanActive,
    tertiary = VelouraColors.GoldWarning,
    background = VelouraColors.SurfaceDark,
    surface = VelouraColors.SurfaceContainerLow,
    onPrimary = VelouraColors.TextPrimary,
    onBackground = VelouraColors.TextPrimary,
    onSurface = VelouraColors.TextPrimary
)

@Composable
fun VelouraTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = VelouraTypography,
        content = content
    )
}

