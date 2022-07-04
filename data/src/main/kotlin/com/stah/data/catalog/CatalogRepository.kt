package com.stah.data.catalog

interface CatalogRepository {
    fun fetchCatalog() : List<Pokemon>
}