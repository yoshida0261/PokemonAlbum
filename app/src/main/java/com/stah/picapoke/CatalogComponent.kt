package com.stah.picapoke

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
//import coil.compose.AsyncImage
import com.stah.model.pokemon.Pokemon
import java.lang.reflect.Modifier

@Composable
fun ShowPokemon(pokemon: Pokemon, modifier: Modifier = Modifier()) {


    /*
    AsyncImage(
        model = "https://example.com/image.jpg",
        contentDescription = null
    )

     */
}

@Preview
@Composable
fun PreviewShowPokemon(){
    ShowPokemon(pokemon = Pokemon("picachu"))
}