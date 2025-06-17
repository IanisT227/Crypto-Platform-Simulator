package org.ianis_teja.crypto_platform_simulator

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import org.ianis_teja.crypto_platform_simulator.app.theme.CryptoPlatformTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    CryptoPlatformTheme(darkTheme = isSystemInDarkTheme()) {

    }
}