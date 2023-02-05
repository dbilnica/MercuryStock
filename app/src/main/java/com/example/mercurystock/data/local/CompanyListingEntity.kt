package com.example.mercurystock.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CompanyListingEntity(
    val name: String,
    val symbol: String,
    val exchange: String,
    //Nastavim primary key a Room automaticky vygeneruje Idcka
    @PrimaryKey val id: Int? = null

)
