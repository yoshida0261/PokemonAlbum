package com.stah.data.catalog

import com.stah.model.pokemon.Pokemon

class CatalogRepositoryImpl : CatalogRepository {


    override fun fetchCatalog(): List<Pokemon> {
        return ArrayList<Pokemon>(1)
    }
}