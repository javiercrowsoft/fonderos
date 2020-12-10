package ar.com.crowsoft.fonderos.data.repository

import ar.com.crowsoft.fonderos.data.model.UserEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<UserEntity, Int> {
    fun findByNick(nick: String): Iterable<UserEntity>
}