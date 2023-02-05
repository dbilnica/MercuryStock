package com.example.mercurystock.domain.repository

import com.example.mercurystock.domain.model.CompanyListing
import com.example.mercurystock.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}