package com.mycompany.anotherone.dto

import java.time.Instant

data class BetItem(
        val id: Long,
        val item: Long,
        val price: Double,
        val startDate: Instant
)