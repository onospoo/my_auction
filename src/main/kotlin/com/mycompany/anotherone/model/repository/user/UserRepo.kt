package com.mycompany.anotherone.model.repository.user

import com.mycompany.anotherone.model.entity.user.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepo : JpaRepository<User, Long> {
}