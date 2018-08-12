package eu.szwiec.checkittravelkit.ui.splash

import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import eu.szwiec.checkittravelkit.prefs.Preferences

class SplashViewModel(private val preferences: Preferences) : ViewModel() {

    val isFirstLaunch = Transformations.map(preferences.isFirstLaunchLD()) { isFirstLaunch ->
        if (isFirstLaunch) {
            preferences.isFirstLaunch = false
        }
        isFirstLaunch
    }
}