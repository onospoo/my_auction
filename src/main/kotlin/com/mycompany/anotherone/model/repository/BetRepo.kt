package com.mycompany.anotherone.model.repository

import com.mycompany.anotherone.model.entity.Bet
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface BetRepo : JpaRepository<Bet, Long> {
}