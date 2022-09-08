package com.stah.data.catalog

import com.stah.model.pokemon.Pokemon

interface CatalogRepository {
    fun fetchCatalog() : List<Pokemon>
}