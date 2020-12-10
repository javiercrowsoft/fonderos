package ar.com.crowsoft.fonderos.core.service

import ar.com.crowsoft.fonderos.core.model.User
import ar.com.crowsoft.fonderos.data.model.UserEntity

interface UserService {
    fun create(user: User): UserEntity
    fun delete(id: Int)
    fun update(id: Int, user: User): UserEntity
    fun get(id: Int): UserEntity
    fun findAll(): Iterable<UserEntity>
}