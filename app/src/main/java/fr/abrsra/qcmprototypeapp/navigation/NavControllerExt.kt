package fr.abrsra.qcmprototypeapp.navigation

import androidx.navigation.NavController
import fr.abrsra.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) = this.navigate(event.route)
