package com.example.mercurystock.data.local

import androidx.room.Query

interface StockDao {

    suspend fun insertCompanyListings(
        companyListingEntities: List<CompanyListingEntity>
    )
    @Query("DELETE FROM companylistingentity")
    suspend fun clearCompanyListings()

    //Konvert vyhledavani na lower case
    @Query(
        """
        SELECT * FROM companylistingentity   
        WHERE LOWER(name) LIKE '%' || LOWER(:query) || '%' OR
            UPPER(:query) == symbol
        """
    )
    //Vysledek vyhledavani
    suspend fun searchCompanyListing(query: String ): List<CompanyListingEntity>
}