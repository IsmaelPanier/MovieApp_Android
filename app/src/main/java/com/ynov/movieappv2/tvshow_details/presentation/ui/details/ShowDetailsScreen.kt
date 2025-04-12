package com.ynov.movieappv2.tvshow_details.presentation.ui.details

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ShowDetailsScreen(showId: Int) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Détails de la série",
            style = MaterialTheme.typography.headlineSmall
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text("ID de la série : $showId")
        Text("Titre : (chargement fictif...)")
        Text("Description : Cette série est très populaire. 😉")
    }
}
