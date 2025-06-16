package org.ianis_teja.crypto_platform_simulator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform