package com.ynov.movieappv2.tvshows.presentation.ui.popular


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil3.compose.rememberAsyncImagePainter
import com.ynov.movieappv2.tvshows.presentation.viewmodel.PopularShowsViewModel
import androidx.compose.foundation.layout.Row as Row

data class Show(val id: Int, val title: String)

@Composable
fun PopularShowsScreen(onShowClick: (Int) -> Unit) {
    val viewModel: PopularShowsViewModel = viewModel()
    val shows by viewModel.shows.collectAsState()

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(shows) { show ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onShowClick(show.id) }
                    .padding(vertical = 8.dp)
            ) {
                if (show.thumbnailUrl.isNotEmpty()) {
                    Image(
                        painter = rememberAsyncImagePainter(show.thumbnailUrl),
                        contentDescription = null,
                        modifier = Modifier.size(72.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                }
                Text(text = show.name, style = MaterialTheme.typography.bodyLarge)
            }
            Divider()
        }
    }
}
