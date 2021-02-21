import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import viewmodels.SignInViewModel

fun main() = Window("Shopping List") {
    Surface(modifier = Modifier.fillMaxSize()) {

    }
    val viewModel = SignInViewModel()
    viewModel.build()
}