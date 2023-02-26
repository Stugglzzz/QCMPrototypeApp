package fr.abrsra.qcmprototypeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fr.abrsra.core.navigation.Route
import fr.abrsra.onboarding_presentation.splash.SplashScreen
import fr.abrsra.qcmprototypeapp.navigation.navigate
import fr.abrsra.qcmprototypeapp.presentation.ui.theme.QCMPrototypeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QCMPrototypeAppTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Route.SPLASH
                ) {
                    composable(Route.SPLASH) {
                        SplashScreen(onNavigate = navController::navigate)
                    }
                    composable(Route.LOGIN) {

                    }
                }
            }
        }
    }
}
