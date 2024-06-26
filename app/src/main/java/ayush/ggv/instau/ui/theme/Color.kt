package ayush.ggv.instau.ui.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val Blue = Color(0xFF1E80F8)
val Gray = Color(0xFFF3F3F4)


val Black = Color(0xFF000000)

val Black87 = Color(0xFF18191A)
val DarkGray = Color(0xFF999A9A)
val Purple700 = Color(0xFF3700B3)

val Black54 = Color(0xFF373B3F)
val Black24 = Color(0xFF242526)


val White = Color(0xFFFFFFFF)

val White87 = Color(0xFFE2E2E2)
val LightGray = Color(0xFF8A8A8D)
val Purple500 = Color(0xFF6200EE)

val White36 = Color(0xFFE5E5E5)
val White76 = Color(0xFFF5F5F5)
val ShimmerLightGray = Color(0xFFF1F1F1)
val ShimmerMediumGray = Color(0xFFE3E3E3)
val ShimmerDarkGray = Color(0xFF1D1D1D)
internal val LightColors = lightColors(
    primary = Blue,
    primaryVariant = Blue,
    background = White76,
    onBackground = Black87,
    surface = White,
    onSurface = Black87
)

internal val DarkColors = darkColors(
    primary = Blue,
    primaryVariant = Blue,
    background = Black87,
    onBackground = White87,
    surface = Black24,
    onSurface = White87
)
object AppColors {
    val bgLight = Color.White
    val bgDark = Color(0xFF1A1A1A)
    val bgMedium = Color(0xFF323232)

    val textLight = Color.White
    val textDark = Color(0xFF393E46)
    val textMedium = Color(0xFF929599)

    val onlineIndicator = Color(0xFF19D42B)
}