package viewmodels

import androidx.compose.runtime.Composable
import models.User
import view.SignInView

class SignInViewModel() {

    var user = User()
    private var view = SignInView()

    @Composable
    fun build() {
        view.show(user, this::onSignIn)
    }

    private fun onSignIn(user: User) {
        println("Przycisk działa")
    }
}