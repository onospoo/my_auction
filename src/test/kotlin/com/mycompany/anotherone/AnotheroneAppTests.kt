package com.mycompany.anotherone

import com.mycompany.anotherone.model.entity.user.User
import com.mycompany.anotherone.model.repository.user.UserRepo
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class AnotheroneAppTests {

    @Autowired
    lateinit var userRepo: UserRepo

    @Test
    fun contextLoads() {
        val user = User(
                firstName = "Misha",
                lastName = "Misha",
                nickname = "normchel"
        )

        userRepo.save(user)
    }

}
