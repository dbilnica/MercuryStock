package com.example.mercurystock.presentation.company_info

import com.example.mercurystock.domain.model.CompanyInfo
import com.example.mercurystock.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)