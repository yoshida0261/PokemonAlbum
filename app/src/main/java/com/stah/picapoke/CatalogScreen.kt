package com.stah.picapoke

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import com.stah.model.pokemon.Pokemon
import java.lang.reflect.Modifier

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CatalogScreen(
    pokemonList: List<Pokemon>,
    modifier: Modifier = Modifier()
) {

    LazyVerticalGrid(
        cells = GridCells.Fixed(3), content = {
            items(pokemonList.size) {

            }

        }
    )
}